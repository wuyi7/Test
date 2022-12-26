package com.company.designpattern.principle.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: WuYi at 2022-11-08 14:18
 * @Description:
 * @Version:1.0
 */
public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza;

    //也可以在这里new，这是简单模式
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType = "";
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(simpleFactory);
    }


}
