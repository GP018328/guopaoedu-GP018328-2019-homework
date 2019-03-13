package gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory;

public class FactoryB implements IAbstractFactory {

    @Override
    public IProduct createProduct() {
        return new FactoryMethodB().createProduct();
    }

    @Override
    public IProduct_New createProduct_New() {
        return new FactoryMethodA_New().createProduct_New();
    }
}
