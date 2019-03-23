package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.register.container;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.test.ConcurrentExecutor;

public class ContainerSingletonTest {
    public static void main(String[] args) {

        try{
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj =  ContainerSingleton.getBean("gp018328.com.gupaoedu.homework.pattern.singleton.homework1.test.Pojo");

                    System.out.println(System.currentTimeMillis()+": 容器单例obj="+obj);
                }
            },10,6);
        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
