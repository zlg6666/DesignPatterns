package FactoryPattern.Factory;


public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        //现在将CreatePizza()方法从工厂对象中移到PizzaStore
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract public FactoryPattern.Factory.Pizza createPizza(String type);
}
