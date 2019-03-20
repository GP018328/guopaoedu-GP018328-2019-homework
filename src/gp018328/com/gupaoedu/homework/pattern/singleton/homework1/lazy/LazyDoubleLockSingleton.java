package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy;

public class LazyDoubleLockSingleton  implements Cloneable  {
    private static volatile LazyDoubleLockSingleton lazyDoubleLockSingleton = null;

    private LazyDoubleLockSingleton(){
        /*
         synchronized(LazyDoubleLockSingleton.class){
          if(lazyDoubleLockSingleton!=null) {
             throw new RuntimeException("单例模式被侵犯！");
           }
         }
        */
    }

    public static LazyDoubleLockSingleton getInstance(){
        if(lazyDoubleLockSingleton==null){
            synchronized (LazyDoubleLockSingleton.class){
                if(lazyDoubleLockSingleton==null){
                    lazyDoubleLockSingleton = new LazyDoubleLockSingleton();
                }
            }
        }
        return lazyDoubleLockSingleton;
    }
}
