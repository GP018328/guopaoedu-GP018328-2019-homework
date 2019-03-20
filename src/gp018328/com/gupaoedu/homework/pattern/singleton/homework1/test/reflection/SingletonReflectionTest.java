package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.test.reflection;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.hungry.HungrySingleton;
import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyInternalClassSingleton;
import java.lang.reflect.Constructor;

public class SingletonReflectionTest {
    public static void main(String[] args) {
        try{
            /* 获取一个对象 */
            //Class<?> classOfSingleton = LazyInternalClassSingleton.class;
            Class<?> classOfSingleton = HungrySingleton.class;

            /* 获取构造函数 */
            Constructor constructorOfSingleton = classOfSingleton.getDeclaredConstructor(null);
            constructorOfSingleton.setAccessible(true);

            /*反射获取单例实例*/
            Object o1 = constructorOfSingleton.newInstance();
            System.out.println("反射获取单例实体："+o1);

            /*正常方式获取单例实例*/
            //Object o2 = LazyInternalClassSingleton.getInstance();
            Object o2 = HungrySingleton.getInstance();
            System.out.println("正常方式获取单例实体："+o2);


            /*检查两个实例是否相同*/
            System.out.println("o1==o2?"+(o1==o2));

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
