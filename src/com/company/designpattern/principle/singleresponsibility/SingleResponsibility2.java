package com.company.designpattern.principle.singleresponsibility;

/**
 * @Author: WuYi at 2022-11-03 11:27
 * @Description:
 * @Version:1.0
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {

    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " run");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " fly");
    }
}

class SeaVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " swim");
    }
}
