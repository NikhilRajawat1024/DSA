public class reversed_linklist {
    Node head,tail;
    public class Node
    {
        int data;
        // Node prev;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head ==null){
             head=newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    
    public void addlast(int data){
        Node newnode = new Node(data);
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
                System.out.print(currnode.data+" -> ");
                currnode = currnode.next;
            }
            System.out.println("NULL");
    }
    
    public void rev()
    {
        Node firstnode=head;
        Node lastnode=tail;

    }

    public void swap(Node s,Node e)
    {
        Node temp=s;
        s=e;
        e=temp;
    }

    public static void main(String[] args) {
        reversed_linklist ll =new reversed_linklist();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.printlist();

        ll.rev();
        ll.printlist();
    }
    
}
