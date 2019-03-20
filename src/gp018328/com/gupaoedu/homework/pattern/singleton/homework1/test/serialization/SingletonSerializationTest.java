package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.test.serialization;

import gp018328.com.gupaoedu.homework.pattern.singleton.homework1.lazy.LazyInternalClassSingleton;

import java.io.*;

public class SingletonSerializationTest {

    public static void main(String[] args) {
        LazyInternalClassSingleton singleton1 = LazyInternalClassSingleton.getInstance();
        System.out.println("singleton1 = "+ singleton1);

        try{
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
            LazyInternalClassSingleton singleton2 = (LazyInternalClassSingleton) ois.readObject();
            System.out.println("singleton2 = "+ singleton2);
            ois.close();
            fis.close();

            System.out.println("singleton1 = singleton2?"+ (singleton1 == singleton2));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
