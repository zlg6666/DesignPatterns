package IteratorsAndCommbinationPatterns.JavaUtilIterator;


import IteratorsAndCommbinationPatterns.Iterator.MenuItem;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author: zlg
 * @date: 2022/9/26
 */
public class JavaDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public JavaDinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalArgumentException("You can't an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position -1; i < (items.length -1); i++) {
                items[i] = items[i +1];
            }
            items[items.length -1] = null;
        }
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
