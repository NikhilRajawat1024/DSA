
public class linkedlist {

    private int size = 0;

    linkedlist(){
        this.size = 0;
    }
    

    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

        public void addFirst(String data) {                
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            

            newnode.next = head;
            head = newnode;
        }
        public void addlast(String data){
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }

            Node currnode = head;
            while(currnode.next!=null){
                currnode = currnode.next;
            }
            currnode.next = newnode;
        }
        public int getsize(){
            return size;
        }


        public void printlist(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            Node currnode = head;
            while(currnode!=null){
                System.out.print(currnode.data+" -> ");
                currnode = currnode.next;
            }
            System.out.println("NULL");
        }

        public void deletefirst(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            size--;
            head = head.next;

        }
        public void deletelast(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            size--;
            if(head.next == null){
                head = null;
                return;
            }
            
            Node secondlast =  head;
            Node lastnode = head.next;
            while(lastnode.next !=null){
                lastnode = lastnode.next;
                secondlast = secondlast.next;
            }
            secondlast.next =null;
        }
    

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst("my ");
        ll.addFirst("hello");

        ll.addlast("name");
        ll.deletelast();
       System.out.println( ll.getsize());
       
        ll.printlist();


    }
}