package IteratorsAndCommbinationPatterns.ComponentPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/9/30
 */
public class Menu extends MenuComponent{
    //菜单可以有任意类型的孩子，这些孩子都必须属于 MenuComponent 类型，我们在内部使用arraylist记录他们
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    //给每个菜单一个名字和一个描述
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //下面是那个方法，将菜单项和菜单加入到菜单中，因为菜单和菜单项都是MenuComponent，所以我们只需要用一个方法就可以两者兼容
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    //这两个方法用来获取名字和描述
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("\n" + getName());
        System.out.println("," + getDescription());
        System.out.println("=========" );

        //菜单是一个组合，包含了菜单和菜单项，所以他应该打印出它所包含的一切，如果他不是这样做的，、
        //那我们就必须遍历组合的每一个节点，然后将每一项打印出来，这样就失去了使用组合的意思所在
        //我们使用了迭代器，用它遍历所有菜单组件，遍历过程中，可能遇到其他菜单，或者遇到菜单项，由于菜单和菜单项都是实现了print方法，所以我们只要调用print方法就可以了
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =  (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
