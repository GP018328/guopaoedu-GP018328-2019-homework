package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.register.enums.test;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.register.enums.EnumSingleton;

import java.io.*;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        System.out.println("singleton1="+singleton1);

        System.out.println("singleton1枚举单例无法克隆！");

        Class<?> classOfSingleton = EnumSingleton.class;

        try{
            /*
            //InstantiationException
            Object o2 = classOfSingleton.newInstance();
            System.out.println("singleton1=o2?"+ (singleton1==o2));

            //NoSuchMethodException
            //获取构造函数
            Constructor constructorOfSingleton = classOfSingleton.getConstructor();
            constructorOfSingleton.setAccessible(true);

            //反射获取单例实例
            Object o1 = constructorOfSingleton.newInstance();
            System.out.println("singleton1枚举单例反射获取单例实体o1="+o1);

            System.out.println("singleton1=o1?"+ (singleton1==o1));
            */

            File file = new File("serializable.txt");
            //序列化
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton1);
            oos.flush();
            oos.close();
            fos.close();

            //反序列化
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton singleton2 = (EnumSingleton) ois.readObject();
            System.out.println("singleton2 = "+ singleton2);
            ois.close();
            fis.close();

            System.out.println("singleton1 = singleton2?"+ (singleton1 == singleton2));

        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
