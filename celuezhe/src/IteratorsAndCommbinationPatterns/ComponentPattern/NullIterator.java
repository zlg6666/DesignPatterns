package IteratorsAndCommbinationPatterns.ComponentPattern;

import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
