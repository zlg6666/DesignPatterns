package IteratorsAndCommbinationPatterns.Iterator;

import java.util.ArrayList;

/**
 * @author: zlg
 * @date: 2022/9/26
 */
public class PancakeHouseMenuIterator implements Iterator{

    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNest() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
