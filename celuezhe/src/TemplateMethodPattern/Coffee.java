package TemplateMethodPattern;

/**
 * @author: zlg
 * @date: 2022/9/13
 */
public class Coffee  extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
