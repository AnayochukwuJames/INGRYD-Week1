package org.example.week5;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}