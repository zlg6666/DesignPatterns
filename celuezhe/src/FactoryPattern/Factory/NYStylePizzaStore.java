package FactoryPattern.Factory;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("PepperoniPizza")) {
            pizza  = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
