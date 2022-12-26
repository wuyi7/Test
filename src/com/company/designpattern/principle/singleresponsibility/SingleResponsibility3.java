package com.company.designpattern.principle.singleresponsibility;

/**
 * @Author: WuYi at 2022-11-03 11:30
 * @Description:
 * @Version:1.0
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("fly");
    }
}
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " run");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + " fly");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + " swim");
    }
}