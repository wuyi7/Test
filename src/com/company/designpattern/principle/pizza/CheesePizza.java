package com.company.designpattern.principle.pizza;

/**
 * @Author: WuYi at 2022-11-08 14:17
 * @Description:
 * @Version:1.0
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨");
    }
}
