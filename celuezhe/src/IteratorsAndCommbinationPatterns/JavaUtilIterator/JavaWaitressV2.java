package IteratorsAndCommbinationPatterns.JavaUtilIterator;




import IteratorsAndCommbinationPatterns.Iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author: zlg
 * @date: 2022/9/26
 */
public class JavaWaitressV2 {
    ArrayList menus;

    public JavaWaitressV2(ArrayList menus) {
       this.menus = menus;
    }

    public void printMenu() {
        Iterator menusIterator = menus.iterator();
        while (menusIterator.hasNext()) {
           Menu menu = (Menu) menusIterator.next();
            printMenu(menu.createIterator());
        }
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
