package gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory;

/**
 * @author 王锋伟
 */
public class FactoryMethodB_New implements IFactory_New {

    @Override
    public IProduct_New createProduct_New() {
        return new ProductB_New();
    }
}
