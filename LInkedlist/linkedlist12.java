public class linkedlist12 {
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

  public void addLast(String data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
          return;
      }
      Node currentNode = head;
      while (currentNode.next != null) {
          currentNode = currentNode.next;
      }
      currentNode.next = newNode;
  }

  public void printList() {
      if (head == null) {
          System.out.println("List is empty");
          return;
      }
      Node currentNode = head;
      while (currentNode != null) {
          System.out.print(currentNode.data + "->");
          currentNode = currentNode.next;
      }
      System.out.println("NULL");
  }

  public static void main(String[] args) {
      linkedlist12 ll = new linkedlist12();
      ll.addFirst("Hey!");
      ll.addLast("google");
      ll.printList();
  }
}
