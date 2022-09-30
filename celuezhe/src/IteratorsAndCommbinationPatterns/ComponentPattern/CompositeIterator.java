package IteratorsAndCommbinationPatterns.ComponentPattern;



import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author: zlg
 * @date: 2022/9/30
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    // 将需要遍历的顶层组合的迭代器传入，我们把它抛进一个栈堆数据结构中
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }



    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator)stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
       if (hasNext()) {
           Iterator iterator = (Iterator)stack.peek();
           MenuComponent menuComponent = (MenuComponent)iterator.next();
           if (menuComponent instanceof Menu) {
               stack.push(((Menu) menuComponent).createIterator());
           }
           return menuComponent;
       } else {
           return null;
       }
    }

    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
