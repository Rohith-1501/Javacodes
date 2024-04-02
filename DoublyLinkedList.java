public class DoublyLinkedList {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;
        Node previous;

        Node(int val) {
            data = val;
            next = null;
            previous = null;
        }
    }

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public void displayrev() {
        Node tempNode = tail;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.previous;
        }
        System.out.println();
    }

    public void insertAtPosition(int pos, int val) {
        Node newNode = new Node(val);
        Node tempNode = head;

        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        for (int i = 0; i < pos - 1; i++) {
            tempNode = tempNode.next;
            if (tempNode == null) {
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next = tempNode.next;
        if (tempNode.next != null) {
            tempNode.next.previous = newNode;
        }
        tempNode.next = newNode;
        newNode.previous = tempNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtPosition(1, 3);
        list.insertAtPosition(2, 4);
        list.insertAtPosition(3, 5);
        list.display();
        list.displayrev();
    }
}
