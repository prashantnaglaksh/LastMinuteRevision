package com.test;

import java.io.File;
import java.sql.Timestamp;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//check if a process is hung or not coding problem of Depali
public class ThreadDemo extends TimerTask implements Runnable {
	// global variable
	static long lCurrentTimeStamp;
	static long lPreviousTimeStamp;
	

	public static void main(String[] args) throws InterruptedException {

		Timestamp lCurrentTimeStamp = new Timestamp(System.currentTimeMillis());
		System.out.println(lCurrentTimeStamp);

		ThreadDemo dd = new ThreadDemo();

		 // Timer time = new Timer(); time.schedule(dd, 0, 1000);
		
		/*
		 * new java.util.Timer().schedule(new java.util.TimerTask() {
		 * 
		 * @Override public void run() { backupThread(); } }, 5000); new
		 * java.util.Timer().schedule(new java.util.TimerTask() { public void run() {
		 * checkProcessHungOrNotThread(); } }, 6000);
		 */
		
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		final Runnable task01 = new Runnable() {
			@Override
		    public void run() {
		    	checkProcessHungOrNotThread();
		    }
		};
		
		final Runnable task02 = new Runnable() {
			@Override
		    public void run() {
				backupThread();
		    }
		};
		
		Future<?> futureHandle01 = scheduler.scheduleWithFixedDelay(task01, 10, 10, TimeUnit.SECONDS);
		Future<?> futureHandle02 = scheduler.scheduleWithFixedDelay(task02, 2, 6, TimeUnit.SECONDS);
		// Start the downloads.
		
		 // thread1.start(); thread2.start();
		  
		  // Wait for them both to finish thread1.join(); thread2.join();
		 
		// Continue the execution...

	}

	public static void backupThread() {
		File file = new File("C:\\Users\\SGSLP041\\Desktop\\js");
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			System.out.println(f);
			lCurrentTimeStamp = System.currentTimeMillis();
			System.out.println("lCurrentTimeStamp : backupThread " + lCurrentTimeStamp);
		}
	}

	public static void checkProcessHungOrNotThread() {
		if (lPreviousTimeStamp == lCurrentTimeStamp) {
			System.out.println("alert team for Backup Process Hung");
			System.out.println("lCurrentTimeStamp : checkProcessHungOrNotThread " + lCurrentTimeStamp);
			System.out.println("lPreviousTimeStamp : checkProcessHungOrNotThread " + lPreviousTimeStamp);
		} else {
			lPreviousTimeStamp = lCurrentTimeStamp;
			System.out.println("lPreviousTimeStamp : checkProcessHungOrNotThread :else " + lPreviousTimeStamp);
		}
	}

	@Override
	public void run() {
		
	}

}

/*
 * static Date timestamp; public void run() { for (int i = 1; i < 5; i++) { try
 * { Thread.sleep(1000); } catch (InterruptedException e) {
 * System.out.println(e); } System.out.println(Thread.currentThread().getName()
 * + "  " + i); } } public static void main(String args[]) { String filePath =
 * "C:\\Users\\SGSPC052\\Documents\\file.txt"; // Creating the File object File
 * file = new File(filePath); // Getting the last modified time long
 * lastModified = file.lastModified(); System.out.println("lastModified " +
 * lastModified); timestamp = new Date(lastModified);
 * System.out.println(timestamp); }
 */