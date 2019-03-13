package gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory;

/**
 * @author 王锋伟
 */
public class FactoryA implements IAbstractFactory {

    @Override
    public IProduct createProduct() {
        return new FactoryMethodA().createProduct();
    }

    @Override
    public IProduct_New createProduct_New() {
        return new FactoryMethodB_New().createProduct_New();
    }
}
