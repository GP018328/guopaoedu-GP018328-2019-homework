package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.test;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyDoubleLockSingleton;
import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyInternalClassSingleton;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        //LazyDoubleLockSingleton lazyDoubleLockSingleton = LazyDoubleLockSingleton.getInstance();
        LazyInternalClassSingleton lazyInternalClassSingleton = LazyInternalClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazyInternalClassSingleton);
    }
}
