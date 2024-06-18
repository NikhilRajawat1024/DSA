public class linkedlist123 {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
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
        head = newNode;
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
    }

    public void deletfirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
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
            System.out.println("the index is invalid");
            return;
        }
        newNode.next= current.next;
        if(current.next!=null){
            current.next = newNode;
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
        linkedlist123 ll = new linkedlist123();
        ll.addfirst("google");
        ll.addfirst("ok");
        ll.addlast("how");
        ll.addinbetween("hlo", 2);
        // ll.deletelast();
        ll.printlist();
    }
}
