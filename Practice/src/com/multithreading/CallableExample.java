package com.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(3000); 
        return "Task completed";
    }

    public static void main(String[] args) {
        Callable<String> callable = new CallableExample();

        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the Callable task to the thread pool
        Future<String> future = executor.submit(callable);

        // Wait for the task to complete and get the result
        try {
            String result = future.get(); // This will block until the result is available
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
