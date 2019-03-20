package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.hungry;

/**
 * @author 王锋伟
 */
public class HungrySingleton {
    //private static boolean flag = false; 解决反射

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton(){
        /*解决反射
        synchronized(HungrySingleton.class)
        {
            if(flag == false)
            {
                flag = !flag;
            }
            else
            {
                throw new RuntimeException("单例模式被侵犯！");
            }
        }
        */
    }


    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
