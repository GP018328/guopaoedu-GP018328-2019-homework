package gp018328.com.gupaoedu.homework.pattern.factory.homework3.factorymethod.test;

import gp018328.com.gupaoedu.homework.pattern.factory.homework3.factorymethod.FactoryMethodA;
import gp018328.com.gupaoedu.homework.pattern.factory.homework3.factorymethod.FactoryMethodB;
import gp018328.com.gupaoedu.homework.pattern.factory.homework3.factorymethod.IFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory;
        factory = new FactoryMethodA();
        factory.createProduct().product();
        factory = new FactoryMethodB();
        factory.createProduct().product();
    }
}
