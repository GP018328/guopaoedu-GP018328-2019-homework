package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.test;

public class LazySingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End!");
    }
}
