public class doublylinkedlist1 {
    Node head;
    class Node{
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = next;
        }


    }

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
             head = newNode;
             return;
        }
    
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if(head!=null){
            head.prev = null;
        }
    }

    public void deletelast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = secondlast.next;

        while(lastNode.next!=null){
            secondlast = secondlast.next;
            lastNode = lastNode.next;
        }
        secondlast.next = null;
    }

    public void printlist(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node currnode = head;
        while(currnode!=null){
          System.out.print(currnode.data+"->");
          currnode = currnode.next;
        }
        System.out.print("NULL");
        
    }

    public static void main(String[] args) {
        doublylinkedlist1 ll = new doublylinkedlist1();
        ll.addfirst(23);
        ll.addfirst(45);
        ll.addfirst(56);
        ll.addlast(98);
        ll.deletefirst();
        ll.deletelast();
        ll.printlist();

    }


}
