package com.linkedList;


// Linked List Creation

public class aLinkedList{
    Node head;
    class Node{
        Node next;
        int val;
        //constructor
        public Node(int x){
            val = x;
            next = null;
        }
    }
    // addittion of element of elements at the begining of the linkedlist
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //addittion of an element at the end of the linkedlist
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = null;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.next = null;
        return;
    }
    // method to print the linkedlist
    public void print(){
        if(head == null){
            return;
        }
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        aLinkedList linkedList = new aLinkedList();
        linkedList.append(3);
        linkedList.append(3);
        linkedList.print();
    }
}