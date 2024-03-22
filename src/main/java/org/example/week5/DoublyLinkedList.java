package org.example.week5;

public class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node current = head;
            while(current.next != null){
                head = head.next;
            }
            current.next = newNode;
            current.prev = current;
        }
    }

    public void insertBeginning(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node current = head;
            while(current.next != null){
                head = head.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertEnd(10);
        list.display();

        list.insertEnd(25);
        list.display();

        list.insertEnd(15);
        list.display();
    }
}