package FactoryPattern.AbstractFactoryPattern;

import FactoryPattern.VeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory =
                new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("new York Style Cheese Pizza");
        } else if (type.equals("Veggies")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York style clam Pizza");
        }
        return pizza;
    }
}
