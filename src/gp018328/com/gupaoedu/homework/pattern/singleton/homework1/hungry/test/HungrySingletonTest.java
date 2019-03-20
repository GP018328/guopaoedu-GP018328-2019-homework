package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.hungry.test;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.hungry.HungrySingleton;
import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.hungry.HungryStaticSingleton;

/**
 * @author 王锋伟
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        //非static饿汉式单例
        HungrySingleton hungrySingleton00 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton00);
        HungrySingleton hungrySingleton01 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton01);
        HungrySingleton hungrySingleton02 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton02);
        //static饿汉式单例
        HungryStaticSingleton hungryStaticSingleton00 = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton00);
        HungryStaticSingleton hungryStaticSingleton01 = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton01);
        HungryStaticSingleton hungryStaticSingleton02 = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton02);
    }
}
