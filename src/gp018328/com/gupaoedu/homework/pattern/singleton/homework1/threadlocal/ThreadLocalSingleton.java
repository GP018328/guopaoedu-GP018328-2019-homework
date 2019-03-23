package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.threadlocal;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadlocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadlocalInstance.get();
    }
}
