package FactoryPattern.AbstractFactoryPattern;

public interface PizzaIngredientFactory {
    //在接口中每一个原料都有一个对应的方法来创建该原料
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
