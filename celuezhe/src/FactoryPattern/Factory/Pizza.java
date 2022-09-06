package FactoryPattern.Factory;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("adding sauce");
        System.out.println("adding topping: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("back for 25 minutes at 350 ");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices ");
    }

    public void box() {
        System.out.println("place pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }
}
