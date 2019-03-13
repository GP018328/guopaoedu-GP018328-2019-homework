package gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory.test;

import gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory.FactoryA;
import gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory.FactoryB;
import gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory.IAbstractFactory;

/**
 * @author 王锋伟
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IAbstractFactory factory;
        factory = new FactoryA();
        factory.createProduct();
        factory.createProduct_New();
        factory = new FactoryB();
        factory.createProduct();
        factory.createProduct_New();
    }

}
