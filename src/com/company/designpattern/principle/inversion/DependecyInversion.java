package com.company.designpattern.principle.inversion;

/**
 * @Author: WuYi at 2022-11-07 15:55
 * @Description:
 * @Version:1.0
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        WX wx = new WX();
        person.receive(wx);
    }
}

class Person {
    public void receive(IReceiver news) {
        String info = news.getInfo();
        System.out.println(info);
    }
}

interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "Information";
    }
}

class WX implements IReceiver {
    @Override
    public String getInfo() {
        return "wx";
    }
}
