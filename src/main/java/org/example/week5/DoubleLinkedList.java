package org.example.week5;

public class DoubleLinkedList {
    Node head;
    public DoubleLinkedList(){
        this.head = null;
    }
    public void insertEnd(int data){
        System.out.printf("Inserting %d at the end of the LinkedList\n", data);
        try{
            Thread.sleep(3900);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
        } else {
            Node current = head;
            while( current.next != null ){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void insertBeginning(int data){
        System.out.printf("Inserting %d at the beginning of the LinkedList\n", data);

        try{
            Thread.sleep(3900);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
        } else {
            Node current = head;
            head = newNode;
            newNode.next = current;
            current.prev = newNode;
        }
    }

    public void insertBefore(int data, int dataBefore){
        System.out.printf("Inserting %d before %d in the LinkedList\n", data, dataBefore);
        try{
            Thread.sleep(3900);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Node newNode = new Node(data);
        Node current = head;
        if( current.data == dataBefore ){
            insertBeginning(data);
            return;
        }
        while( current.next != null && current.data != dataBefore ){
            current = current.next;
        }

        if( current.data != dataBefore ){
            System.out.printf("The data (%d) couldn't be added to the list; can not find dataBefore (%d)\n", data, dataBefore);
        } else {
            newNode.next = current;
            current.prev.next = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
        }

    }

    public void removeData(int data){
        System.out.printf("Removing %d from the LinkedList\n", data);
        try{
            Thread.sleep(3900);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        Node current = head;

        if( current.data == data ){
            head = current.next;
            current.prev = null;
            return;
        }

        while( current.next != null && current.data != data ){
            current = current.next;
        }
        if( current.data != data ){
            System.out.printf("The data (%d) can not be removed as it doesn't exist in the LinkedList", data);
        } else {
            if( current.next == null ){
                current.prev.next = null;
            }
            current.prev.next = current.next;
//            current.next.prev = current.prev;

        }

    }


    public void display(){
        Node current = head;
        System.out.println();
        System.out.print("LinkedList: ");
        if( current == null ){
            System.out.println("Empty LinkedList, add items");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println();
            return;
        }
        while(current != null ){
            try{
                System.out.print(current.data + " <-> ");
                current = current.next;
                Thread.sleep(1200);
            }catch (InterruptedException exception){
                System.out.println(exception.getMessage());
            }
        }
        System.out.println("null");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.display();
        list.insertEnd(10);
        list.display();
        list.insertEnd(25);
        list.display();
        list.insertEnd(15);
        list.display();
        list.insertBeginning(30);
        list.display();
        list.insertBefore(50, 15);
        list.display();
        list.insertBefore(70, 28);
        list.display();
        list.insertBefore(70, 30);
        list.display();
        list.insertBefore(90, 50);
        list.display();
        list.removeData(99);
        list.display();
        list.removeData(15);
        list.display();
        list.removeData(70);
        list.display();
    }
}