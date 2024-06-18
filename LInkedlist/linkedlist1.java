public class linkedlist1 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(){
            this.data = data;
            this.next = next;
        }

    }
    public void addfirst(String data){
        Node newnode = new Node();
        if(head ==null){
            newnode = head;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    
    public void addlast(String data){
        Node newnode = new Node();
        if(head ==null){
            System.out.println("list is empty");
            return;
          }
          Node currNode = head;
          while(currNode.next!=null){
            currNode = currNode.next;
          }
          currNode.next = newnode;
          
    }
    public void printlist(){
        if(head ==null){
            System.out.println("list is empty");
            return;
          }
            Node currnode  = head;
            while(currnode!= null){
                System.out.println(currnode.data+"->");
                currnode = currnode.next;
            }
            System.out.println("NULL");
    }
    public void deletefirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        head = head.next;
    }
    public void deletelast(){
        if(head == null){
            System.out.println("list is empty");
        }
        if(head.next == null){
            head = null;
        }
        Node secondlast= head;
        Node last = head.next;
        while(last.next!=null){
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast = null;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst("Hey!");
        ll.addlast("google");
        ll.addlast("how");
        ll.deletelast();
        ll.printlist();
    }
}
