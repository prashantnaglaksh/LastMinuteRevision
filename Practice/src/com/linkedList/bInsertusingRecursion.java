package com.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        head = insertRecursive(head, data);
    }

    Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
//The recursive call current.next = insertRecursive(current.next, data) helps maintain the proper linkage between nodes.
        current.next = insertRecursive(current.next, data);
        return current;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class bInsertusingRecursion {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(20);

        linkedList.display(); // Output: 5 10 15 20
    }
}

//Let's break it down step by step:
//
//Initially, we start with the first node as current.
//In each recursive call, we move to the next node by passing current.next as the new current node.
//When we reach the end of the list (i.e., current == null), we create a new node with the given data.
//The new node is returned from the recursive call and assigned to current.next.
//This assignment updates the next reference of the previous node to point to the newly created node, establishing the proper linkage.
//The recursion unwinds, and each previous node updates its next reference until we reach the initial call.
