package com.company;

/**
 * @Author: WuYi at 2022-06-19 17:59
 * @Description:
 * @Version:1.0
 */
class RunnableDemo implements Runnable {
    private String name;
    private Thread T;

    public RunnableDemo(String name) {
        this.name = name;
        System.out.println("Create Thread " + name);
    }

    @Override
    public void run() {
        System.out.println("Running " + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + name + " " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
        System.out.println("Thread " + name + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + name);
        if (T == null) {
            T = new Thread(this, name);
            T.start();
        }
    }

}

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    ThreadDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
