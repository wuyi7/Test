package com.company.designpattern.principle.segregation;

/**
 * @Author: WuYi at 2022-11-03 14:20
 * @Description:
 * @Version:1.0
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B实现操作1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现操作2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现操作3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现操作4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现操作5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D实现操作1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现操作2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现操作3");
    }

    @Override
    public void operation4() {
        System.out.println("D实现操作4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现操作5");
    }
}

class A { //A通过接口（Interface1）依赖（使用）B类，但是只使用123方法
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C { //C通过接口（Interface1）依赖（使用）D类，但是只使用145方法
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }
}