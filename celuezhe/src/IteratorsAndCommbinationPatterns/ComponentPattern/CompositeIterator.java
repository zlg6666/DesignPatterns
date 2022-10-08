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
        //判断是否还有下一个元素，我们就检查栈堆是否被清空，如果已经空了表示没有下一个元素了
        if (stack.empty()) {
            return false;
        } else {
            //否则，我们就从栈堆的顶层取出迭代器，看看是否还有下一个元素。如果没有元素，就将它弹出栈堆，然后递归hasNext()
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
        //当我们想取下一个元素的时候，先调用hasNext方法，确定是否有下一个元素
       if (hasNext()) {
           //如果有下一个元素，我们就从栈堆中取出当前的迭代器，然后取出他的下一个元素
           Iterator iterator = (Iterator)stack.peek();
           MenuComponent menuComponent = (MenuComponent)iterator.next();
           //如果元素是菜单，我们又又有了一个需要包含在遍历中的组合，
           //所以我们将它丢进栈堆，不管是不是菜单，我们都返回改组件
           if (menuComponent instanceof Menu) {
               stack.push(((Menu) menuComponent).createIterator());
           }
           return menuComponent;
       } else {
           return null;
       }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
