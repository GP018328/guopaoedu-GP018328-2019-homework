package gp018328.com.gupaoedu.homework.pattern.factory.homework3.abstractfactory;

/**
 * @author 王锋伟
 */
public class FactoryMethodA_New implements IFactory_New {

    @Override
    public IProduct_New createProduct_New() {
        return new ProductA_New();
    }
}
