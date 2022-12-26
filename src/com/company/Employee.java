package com.company;

import java.io.Serializable;

/**
 * @Author: WuYi at 2022-05-29 15:10
 * @Description:
 * @Version:1.0
 */
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
