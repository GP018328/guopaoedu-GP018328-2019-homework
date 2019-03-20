package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.test.clone;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyDoubleLockSingleton;

public class SingletonCloneTest implements Cloneable {
    public static void main(String[] args) {
        LazyDoubleLockSingleton o1 = LazyDoubleLockSingleton.getInstance();

        //LazyDoubleLockSingleton o2 = (LazyDoubleLockSingleton)o1.clone();
    }

}
