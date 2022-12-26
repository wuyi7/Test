package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: WuYi at 2022-05-28 15:21
 * @Description:
 * @Version:1.0
 */
public class TestLinkedList {
//    public static void main(String[] args) {
//        Employee e = new Employee();
//        e.name = "Reyan Ali";
//        e.address = "Phokka Kuan, Ambehta Peer";
//        e.SSN = 11122333;
//        e.number = 101;
//        try {
//            FileOutputStream fileOut =
//                    new FileOutputStream("D:\\Project\\JavaTest\\src\\com\\company\\employee.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(e);
//            out.close();
//            fileOut.close();
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//    }
public static void main(String[] args) {
    Employee e = null;
    try
    {
        FileInputStream fileIn = new FileInputStream("D:\\Project\\JavaTest\\src\\com\\company\\employee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        e = (Employee) in.readObject();
        in.close();
        fileIn.close();
    }catch(IOException i)
    {
        i.printStackTrace();
        return;
    }catch(ClassNotFoundException c)
    {
        System.out.println("Employee class not found");
        c.printStackTrace();
        return;
    }
    System.out.println("Deserialized Employee...");
    System.out.println("Name: " + e.name);
    System.out.println("Address: " + e.address);
    System.out.println("SSN: " + e.SSN);
    System.out.println("Number: " + e.number);

}

}

