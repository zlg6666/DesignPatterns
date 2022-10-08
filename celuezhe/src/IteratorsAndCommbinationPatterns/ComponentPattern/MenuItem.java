package IteratorsAndCommbinationPatterns.ComponentPattern;

import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/9/30
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.println("(V)");
        }
        System.out.println(" " + getPrice());
        System.out.println(" ---" + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
