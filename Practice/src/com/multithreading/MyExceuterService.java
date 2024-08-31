package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExceuterService implements Runnable{
    String name;
    public MyExceuterService(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("start thread " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("endin the thread " + name);
    }
    public static void main(String[] args) {
        ExecutorService executorService =  Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; i++){
            MyExceuterService myExceuterService = new MyExceuterService("myWorkerThread" + i);
            executorService.execute(myExceuterService);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){}
        System.out.println("All request completed successfully");
    }
}
