package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.test;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyDoubleLockSingleton;
import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyInternalClassSingleton;
import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.threadlocal.ThreadLocalSingleton;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        //LazyDoubleLockSingleton lazyDoubleLockSingleton = LazyDoubleLockSingleton.getInstance();
        //LazyInternalClassSingleton lazyInternalClassSingleton = LazyInternalClassSingleton.getInstance();
        //System.out.println(Thread.currentThread().getName()+":"+lazyInternalClassSingleton);

        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
        System.out.println("Thread Name("+Thread.currentThread()+"):"+ThreadLocalSingleton.getInstance());
    }
}
