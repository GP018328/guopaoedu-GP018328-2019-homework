package gp018328.com.gupaoedu.homework.pattern.factory.homework3.simplefactory.test;

import gp018328.com.gupaoedu.homework.pattern.factory.homework3.simplefactory.Constant;
import gp018328.com.gupaoedu.homework.pattern.factory.homework3.simplefactory.Factory;
import gp018328.com.gupaoedu.homework.pattern.factory.homework3.simplefactory.IProduct;

/**
 * @author 王锋伟
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        IProduct product;
        try{
            product = factory.createProduct(Constant.PRODUCT_TYPE_A);
            product.product();;
            product = factory.createProduct(Constant.PRODUCT_TYPE_B);
            product.product();;
            product = factory.createProduct(null);
            product.product();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
