package com.company.designpattern.principle;

/**
 * @Author: WuYi at 2022-11-07 17:08
 * @Description:
 * @Version:1.0
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        //返回true，是同一个对象
        instance.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("OK");
    }
}
