package IteratorsAndCommbinationPatterns.JavaUtilIterator;

import IteratorsAndCommbinationPatterns.Iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/9/23
 */
public class JavaPancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public JavaPancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B Pancakes Breakfast", "Pancakes with scrambled eggs", true, 2.99);
        addItem("Regular Pancakes Breakfast", "Pancakes with fried eggs", true, 1.99);
        addItem("Blueberry Pancakes Breakfast", "Pancakes made with fresh", true, 5.99);
        addItem("K&B Pancakes Breakfast", "Pancakes with choice", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return  menuItems.iterator();
    }
}
