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

    }

    public void addinbetween(String data, int atindex) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        int index = 0;

        while (current != null && index < atindex - 1) {
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

    public static void main(String[] args) {
        doublelinkedlist ll = new doublelinkedlist();

        ll.addfirst("guyss");
        ll.addfirst("hello");
        ll.printlist();
    }
}
