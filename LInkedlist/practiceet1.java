//SINGULAR LINKEDLIST 
public class practiceet1 {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;

    }

    public void reverselist() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;

    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    public void rotatelist(int times) {

        if (head == null || head.next == null || times == 0) {
            return; // No need to rotate if the list is empty, has one element, or no rotation needed
        }
    
        // Find the length of the list
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
    
        // Effective number of rotations
        times = times % length;
        if (times == 0) {
            return; // No need to rotate if effective rotations are zero
        }
    
        // Make the list circular
        temp.next = head;
    
        // Find the new end of the list
        for (int i = 0; i < length - times; i++) {
            temp = temp.next;
        }
    
        // Set the new head and break the circular link
        head = temp.next;
        temp.next = null;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlastnode = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlastnode = secondlastnode.next;
        }
        secondlastnode.next = null;

    }

    public static void main(String[] args) {
        practiceet1 ll = new practiceet1();
        ll.addFirst("guys");
        ll.addFirst("hello");
        ll.addlast("how");
        ll.printlist();
        // ll.deletefirst();
        // ll.reverselist();
        ll.rotatelist(2);
        ll.printlist();
    }

}
