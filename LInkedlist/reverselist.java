public class reverselist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = head;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printlist(){
        if(head == null){
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

    public void reverselist(){
       if(head == null){
        System.out.println("the list is empty");
       }
       Node currnode = head;
    }

    public static void main(String[] args) {
        reverselist ll = new reverselist();
        ll.addfirst(24);
        ll.addfirst(26);
        ll.addfirst(28);
        System.out.println("the list without reverse :");
        ll.printlist();
        System.out.println("the list after reverse ");

    }
}
