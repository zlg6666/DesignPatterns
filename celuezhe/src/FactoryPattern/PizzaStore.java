package FactoryPattern;

public class PizzaStore {
    //为pizzaStore 加上SimplePizzaFactory的引用，
    SimplePizzaFactory factory;
    public  PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
