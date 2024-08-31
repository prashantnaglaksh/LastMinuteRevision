// Java program to do level order traversal line by line
package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Prints level order traversal line
// by line using two queues.
    static void levelOrder(Node root) {
        if(root ==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node temp = q.poll();
            System.out.println(temp.data);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }

    // Driver function
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        levelOrder(root);
    }
}

// This code is Contributed by Rishabh Jindal
