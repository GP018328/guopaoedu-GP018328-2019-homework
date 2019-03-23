package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.threadlocal;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.test.ExecutorThread;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println("Thread Name："+Thread.currentThread());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        System.out.println("Thread Name："+t1);
        t1.start();


        Thread t2 = new Thread(new ExecutorThread());
        System.out.println("Thread Name："+t2);
        t2.start();
    }

}
