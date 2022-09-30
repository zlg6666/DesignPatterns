package IteratorsAndCommbinationPatterns.JavaUtilIterator;

import IteratorsAndCommbinationPatterns.Iterator.DinerMenuIterator;
import IteratorsAndCommbinationPatterns.Iterator.MenuItem;

import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/9/23
 */
public class JavaDineMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;


    public JavaDineMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon tomato", true, 2.99);
        addItem("BLT", "Bacon with lettuce", false, 1.99);
        addItem("Soup of the day", "Soup of the day", false, 5.99);
        addItem("HotDog", "A hot dog", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println(" 对不起，不能添加太长");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new JavaDinerMenuIterator(menuItems);
    }
}
