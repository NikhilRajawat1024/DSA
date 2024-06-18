public class doublylinkedlist {

    Node head;

    class Node {
        Node prev;
        String data;
        Node next;

        Node(String data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addlast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;
        newNode.prev = currentnode;
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void removelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currentnode = head;
        Node lastNode = currentnode.next;
        while (lastNode.next != null) {
            currentnode = currentnode.next;
            lastNode = lastNode.next;

        }
        currentnode.next = null;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public void addinbetween(String data, int atindex) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        int index = 0;

        while (current != null && index < atindex) {
            current = current.next;
            index++;
        }
        if (current == null) {
            System.out.println("Invalid index");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;

    }

    public static void main(String[] args) {
        doublylinkedlist ll = new doublylinkedlist();

        ll.addfirst("guyss");
        ll.addfirst("hello");
        ll.addlast("how");
        ll.addlast("are");
        ll.addlast("you");

        ll.addinbetween("A", 1);

        ll.printlist();

    }
}
