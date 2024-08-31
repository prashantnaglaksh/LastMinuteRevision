package com.multithreading;
/*
Join method in Java allows one thread to wait until another
 thread completes its execution. In simpler words, it means it
 waits for the other thread to die.
 Current thread will wait until the thread on which join is called to finish
*/
class ThreadJoining extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            try
            {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            }
            catch(Exception ex)
            {
                System.out.println("Exception has" + " been caught" + ex);
            }
            System.out.println(i);
        }
    }
}

class ThreadJoin
{
    public static void main (String[] args)
    {
        // creating two threads
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        // thread t1 starts
        t1.start();
        // starts second thread after when
        // first thread t1 has died.
        try
        {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " + "been caught" + ex);
        }
        // t2 starts
        t2.start();
        // starts t3 after when thread t2 has died.
        try
        {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has been" + " caught" + ex);
        }
        t3.start();
    }
}
