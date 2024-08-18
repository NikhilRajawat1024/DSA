// DOUBLY LINKEDLIST

public class practiceset2 {

    Node head;

    class Node {
        String val;
        Node next;
        Node prev;

        Node(String val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }

    public void addLast(String val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
        newNode.prev = currnode;

    }

    public void addFirst(String val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    } 

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.prev.next = null;
    }

    public void insertAt(int index, String val) {
        if (index == 0) {
            addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node currNode = head;
        for (int i = 0; i < index - 1; i++) {
            if (currNode == null) {
                System.out.println("Index out of bounds");
                return;
            }
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        if (currNode.next != null) {
            currNode.next.prev = newNode;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    
    public void deleteAt(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node currNode = head;
        for (int i = 0; i < index; i++) {
            if (currNode == null) {
                System.out.println("Index out of bounds");
                return;
            }
            currNode = currNode.next;
        }
        if (currNode == null || currNode.prev == null) {
            System.out.println("Index out of bounds");
            return;
        }
        if (currNode.next != null) {
            currNode.next.prev = currNode.prev;
        }
        currNode.prev.next = currNode.next;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("list is not empty but follow some thing i did not know yet");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.val + "->");
            currnode = currnode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        practiceset2 ll = new practiceset2();
        ll.addLast("hello");
        ll.addFirst("good");
        ll.addFirst("hii");
        ll.addFirst("hey");
        ll.insertAt(2, "again");
        ll.printlist();
    }

}
