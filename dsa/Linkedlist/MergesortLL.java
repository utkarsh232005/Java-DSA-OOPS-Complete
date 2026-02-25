package dsa.Linkedlist;

import java.util.*;

import dsa.Linkedlist.RemoveNfromend.Node;

public class MergesortLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: new node next = head
        // link between 2 nodes
        newNode.next = head;

        // step 3: head should be pointing to newNode
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node h1, Node h2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public static void main(String[] args) {
        MergesortLL ll = new MergesortLL();
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(1);
        ll.addFirst(8);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}