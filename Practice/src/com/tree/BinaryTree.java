// non-recursive java program for inorder traversal
package com.tree;

import java.util.Stack;
/* Class containing left and right child of current node and key value*/
class Node{
    int data;
    Node left, right;
    public Node(int val){
        data = val;
        left = right = null;
    }
}
/* Class to print the inorder traversal */
public class BinaryTree {
    Node root;
    public void inorder(){
        if(root == null){
            return;
        }
        Stack<Node> s = new Stack<>();
        Node curr = root;
        // traverse the tree
        while(curr != null || s.size() > 0){
            /* Reach the left most Node of the curr Node */
            while(curr != null){
                /* place pointer to a tree node on the stack before traversing the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }
            /* Current must be NULL at this point */
            curr = s.pop();
            System.out.println(curr.data + " ");
            /* we have visited the node and its left subtree.  Now, it's right subtree's turn */
            curr = curr.right;
        }

    }

    public static void main(String[] args) {
          /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.inorder();

    }
}
