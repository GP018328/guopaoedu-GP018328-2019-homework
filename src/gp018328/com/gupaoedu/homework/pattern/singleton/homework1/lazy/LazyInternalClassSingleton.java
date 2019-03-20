package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy;

import java.io.Serializable;

public class LazyInternalClassSingleton  implements Serializable {
    private LazyInternalClassSingleton(){}

    public static LazyInternalClassSingleton getInstance(){
        return LazyHolder.lazyInternalClassSingleton;
    }

    private static class LazyHolder{
        private static final LazyInternalClassSingleton lazyInternalClassSingleton = new LazyInternalClassSingleton();
    }
}
