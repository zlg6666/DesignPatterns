package FactoryPattern.AbstractFactoryPattern;

public abstract class Pizza {
    //每个Pizza都持有一组准备是会用到的原料
    String name;
    Sauce sauce;
    Dough dough;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("back for 25 minutes at 350 ");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices ");
    }

    public void box() {
        System.out.println("place pizza in official pizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "";
    }
}
