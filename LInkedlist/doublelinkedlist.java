

public class doublelinkedlist {

    private int sizeis;
    doublelinkedlist(){
        this.sizeis = 0;
    }
    Node head;
    class Node{
        String data;
        Node next;
        Node prev;
        Node(){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public void addfirst(String data){
        Node newnode = new Node();
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head.prev;
        head = newnode;
        sizeis++;

    }
    public int getsize(){
        return sizeis;
    }
    public void printlist(){

        Node currentnode = head;
        while(currentnode.next!=null){
        System.out.println(currentnode.data+"->");
            currentnode = currentnode.next;

        }  
        System.out.println("NULL");
    }
  
   
    
   
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst("hello");
        ll.addFirst("guyss");
        System.out.println(ll.getsize());
        ll.printlist();

        
    }
}
