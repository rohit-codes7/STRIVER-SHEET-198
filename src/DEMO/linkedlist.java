package DEMO;

import LinkedList.Node;

public class linkedlist {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int data){
        Node temp = new Node(data);
        if (head==null){
            head =temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail= temp;
        }
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int size(){
        int count = 0;
        Node temp = head;

        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    void insertAtBeginning(int data){
        Node temp = new Node(data);
        if (head==null){
            head = temp;
            tail =temp;
        }
        else {
            temp.next= head;
            head = temp;
        }
    }

    void insertAt(int index, int data){
        if (index<0 || index>size()){
            System.out.print("Wrong input,Please give the valid index");
            return;
        }
        Node t = new Node(data);
        Node temp = head;
        if (index==size()){
            insertAtEnd(data);
            return;
        }

        if (index==0){
            insertAtBeginning(data);
        }
        for (int i = 1; i < index-1; i++) {
            t=temp.next;
            temp.next=t;

        }

    }
}
