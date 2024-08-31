package com.multithreading;

//Java program to implement solution of producer
//consumer problem.

import java.util.LinkedList;

public class ProducerConsumer {
	public static void main(String[] args) throws InterruptedException{
		
//		Object of a class that has both produce() and consume() methods
		final Company company = new Company();
		
		Thread producerThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					company.produc();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumerThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					company.Consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producerThread.start();
		consumerThread.start();
	
		producerThread.join();
		consumerThread.join();
	}
	
}

class Company{
	// Create a list shared by producer and consumer
    // Size of list is 2.
	int capacity = 2;
	LinkedList<Integer> ln = new LinkedList<>();
	
	public void produc() throws InterruptedException {
		int value = 0;
		while(true) {
			synchronized(this) {
				if(ln.size() != capacity) {
					System.out.println("produced ::" + value);
					ln.add(value++);
//					notifies the consumer thread that now it can start consuming
					notify();
//					makes the working of program easier to understand no use of this here
					Thread.sleep(1000);
				}else {
					wait();
				}
			}
		}
	}
	
	public void Consumer() throws InterruptedException{
		while(true) {
			synchronized(this) {
				if(!ln.isEmpty()) {
					int val = ln.removeFirst();
					System.out.println("consumed ::" + val);
//					Wake up producer thread
					notify();
					Thread.sleep(1000);
				}else {
					wait();
				}
			}
		}
	}
	
}
