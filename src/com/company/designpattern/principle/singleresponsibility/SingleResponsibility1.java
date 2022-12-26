package com.company.designpattern.principle.singleresponsibility;

/**
 * @Author: WuYi at 2022-11-03 11:23
 * @Description:
 * @Version:1.0
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("moto");
        vehicle.run("plane");//wrong ,should be fly
    }
}

//run 违反了单一职责原则，飞机不该run
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " run");
    }
}