package IteratorsAndCommbinationPatterns.JavaUtilIterator;



import IteratorsAndCommbinationPatterns.Iterator.MenuItem;

import java.util.Iterator;


/**
 * @author: zlg
 * @date: 2022/9/26
 */
public class JavaWaitress {
    Menu JavaPancakeHouseMenu;
    Menu JavaDineMenu;

    public JavaWaitress(Menu JavaPancakeHouseMenu, Menu JavaDineMenu) {
        this.JavaPancakeHouseMenu = JavaPancakeHouseMenu;
        this.JavaDineMenu = JavaDineMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = JavaPancakeHouseMenu.createIterator();
        Iterator dinerIterator = JavaDineMenu.createIterator();
        System.out.println("MENU\n ---\n BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\n LUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName1() + ", ");
            System.out.println(menuItem.getPrice() + " --");
            System.out.println(menuItem.getDescription());
        }
    }
}
