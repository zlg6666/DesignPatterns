package IteratorsAndCommbinationPatterns.Iterator;

/**
 * @author: zlg
 * @date: 2022/9/26
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DineMenu dineMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DineMenu dineMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dineMenu = dineMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dineMenu.createIterator();
        System.out.println("MENU\n ---\n BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\n LUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNest()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName1() + ", ");
            System.out.println(menuItem.getPrice() + " --");
            System.out.println(menuItem.getDescription());
        }
    }
}
