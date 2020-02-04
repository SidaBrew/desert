package com.Thread;



/**
 * synchronized
 * 1.成员锁：某一线程进入锁之后，其他线程必须等待此线程执行完锁内的程序才能继续调用锁所在的方法。
 *          <1>synchronized在方法上声明，在public之后，void之前 例：public Synchronzied void method(){}</>
 *          <2>Synchronized() 对某一代码块上，括号里可以进入的变量</2>
 * 2.对象锁：某一线程进入锁之后，就获得了此对象锁，其他线程对此对象的任何操作都不被允许。
 *          <1>Synchronized(this){}  就获得了此对象锁，其他线程对此对象的任何操作都不被允许。
 *          <2>Synchronized(Single.class){}就获得了此对象锁，其他线程对此对象的任何操作都不被允许。
 *          <3>Object obj=new Object(); Sychronized(obj) 虚拟对象锁，其他线程还可以对此对象进行其他操作
 */
//1.多线程启动的两种方式之一
public class ThreadTest {

    public static void main(String[] args) {
        Runner runner = new Runner();
        //run的话不是多线程，就是普通的调用方法。
        Thread t1 = new Thread(runner);
        t1.start();
        for(int x=0;x<100;x++)	//t1 线程与main线程同时运行，如果不加Thread.sleep(100)的话很难看出两个线程在交叉运行
        {
            try{
                Thread.sleep(100);
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"x="+x);
        }
    }
}
