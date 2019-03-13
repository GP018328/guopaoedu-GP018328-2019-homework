package gp018328.com.gupaoedu.homework.pattern.factory.homework3.simplefactory;

/**
 * @author 王锋伟
 */
public class Factory {
    public IProduct createProduct(String productType) {
        IProduct product=null;
        if(Constant.PRODUCT_TYPE_A.equalsIgnoreCase(productType)) {
            product = new ProductA();
        }
        if(Constant.PRODUCT_TYPE_B.equalsIgnoreCase(productType)) {
            product = new ProductB();
        }

        return product;
    }
}
