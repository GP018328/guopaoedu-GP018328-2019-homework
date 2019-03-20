package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.hungry;

/**
 * @author 王锋伟
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return HUNGRY_STATIC_SINGLETON;
    }
}
