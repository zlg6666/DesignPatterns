package IteratorsAndCommbinationPatterns.ComponentPattern;

/**
 * @author: zlg
 * @date: 2022/9/30
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        //创建所有的菜单对象
        MenuComponent pancakeMenuHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER  MENU", "lunch");
        MenuComponent cafeMenu = new Menu("CAFE  MENU", "dinner");
        MenuComponent dessertMenu = new Menu("DESSERT  MENU", "Dessert of course");

        //创建一个最顶层的菜单，allMenus
        MenuComponent allMenus = new Menu("ALL MENUS", "ALl menus combined");

        //使用组合 的add 方法，将每个菜单加入到顶层菜单中
        allMenus.add(pancakeMenuHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //添加菜单项
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Pta", "Se", true, 9));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
