package com.stactandqueues;

import java.util.Scanner;
// implementing stack using an array
public class MyStack {
    int max = 1000;
    int[] array = new int[max];
    int top;
    public MyStack(){
        top = -1;
    }
    public boolean isEmpty(){
        return (top <0);
    }
    public void push(int val){
        if(top >= max - 1) {
            System.out.println("stack is overflow");
            return;
        }
        array[++top] = val;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty or underflow  ");
            return 0;
        }
        return array[top];

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is underfloe or empty ");
            return 0;
        }
        int popedelement = array[top];
        top--;
        return popedelement;

    }
    public void print(){
        if(isEmpty()){
            System.out.println("stack emplty");
            return;
        }
        while(top >= 0){
            System.out.println(array[top]);
            top--;
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MyStack s = new MyStack();
        s.push(5);
        s.push(6);
        s.push(10);
        System.out.println("pop " + s.pop());
        System.out.println("peek " + s.peek());
        s.print();
    }
}
