package dsa.Linkedlist;

public class DoublyLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(6);
        dll.addFirst(7);
        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.print();
    }
}