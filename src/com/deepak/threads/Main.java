package com.deepak.threads;

class Counter{
    int count;

    public synchronized void increment(){
        count++;
    }
}
public class Main {
    public static void main(String[] args)  {
        Counter c = new Counter();

        Runnable r1 = ()->{
            for(int i=0;i<500;i++){
                c.increment();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable r2= ()->{
            for(int i=0;i<500;i++){
                c.increment();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.count);

    }
}
