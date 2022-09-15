package TemplateMethodPattern;

/**
 * @author: zlg
 * @date: 2022/9/14
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //这里我们添加了条件语句，该条件是否成立，是由一个具体的方法 customerWantsCondiments 决定的
        // 如果 顾客想要调料，我们才给调用 addCondiments() 方法
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    //这里定义了一个方法（通常是空的缺省实现），这里返回true 不做别的事
    // 这就是一个钩子，子类可以覆盖这个方法，但不见得一定会这么做
    private boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
