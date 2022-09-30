package IteratorsAndCommbinationPatterns.ComponentPattern;

/**
 * @author: zlg
 * @date: 2022/9/30
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
