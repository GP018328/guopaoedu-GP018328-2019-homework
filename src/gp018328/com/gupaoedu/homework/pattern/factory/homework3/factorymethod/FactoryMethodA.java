package gp018328.com.gupaoedu.homework.pattern.factory.homework3.factorymethod;

/**
 * @author 王锋伟
 */
public class FactoryMethodA implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
