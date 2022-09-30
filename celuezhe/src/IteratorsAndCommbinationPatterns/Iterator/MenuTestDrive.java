package IteratorsAndCommbinationPatterns.Iterator;

/**
 * @author: zlg
 * @date: 2022/9/26
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DineMenu dineMenu = new DineMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dineMenu);
        waitress.printMenu();
    }
}
