package com.stactandqueues;

// impelemting queue using an array
public class MyQueue {
    int front, rear, size;
    int cap = 100;
    int[] array = new int[cap];

    public MyQueue(){
        front = size = 0;
        rear = cap -1;

    }
    public boolean isfull(){
        return (size >= cap);
    }
    public boolean isempty(){
        return (size == 0);
    }
    // Method to add an item to the queue.
    // It changes rear and size
    public void enqueue(int val){
        if(isfull()){
            return;
        }
        rear = (rear + 1)%cap;
        array[rear] = val;
        size++;
        System.out.println("i am enqueue " + val);
    }
    // Method to remove an item from queue.
    // It changes front and size
    public int dequeue(){
        if(isempty()){
            return 0;
        }
        int dequeuedelement = array[front];
        front = (front + 1)%cap;
        size--;
        return dequeuedelement;
    }
    public int front(){
        if(isempty()){
            return 0;
        }
        return array[front];
    }
    public int rear(){
        if(isempty()){
            return 0;
        }
        return array[rear];
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(10);
        System.out.println("dequeue is " + q.dequeue());
        System.out.println("front is " + q.front());
        System.out.println("rear is " + q.rear());

    }
}
