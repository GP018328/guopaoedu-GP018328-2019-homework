package gp018328.com.gupaoedu.homework.pattern.singleton.homework1.register.enums;

import java.io.Serializable;

public enum EnumSingleton implements Cloneable, Serializable {
    INSTANCE;

    private String name;

    public EnumSingleton getInstance(){
        System.out.println("调用了EnumSingleton实例："+ (this == INSTANCE));
        return INSTANCE;
    }

}
