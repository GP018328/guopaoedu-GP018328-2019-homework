package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy;

/**
 * @author 王锋伟
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    public synchronized  static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
