package FactoryPattern.Factory;

/**
 * 工厂方法模式 定义了一个创建对象的接口，但是由子类决定要实例化的类是哪一个
 * 工厂方法让类把实例话推迟到子类
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        ChicagStylePizzaStore chicagStylePizzaStore = new ChicagStylePizzaStore();
        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName() + "\n");
        Pizza pizza1 = chicagStylePizzaStore.orderPizza("cheese");
        System.out.println("Joel order a " + pizza1.getName() + "\n");
    }
}
