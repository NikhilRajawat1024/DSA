public class stack_using_linkedlist {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head; // JB BHII HUM NAYI LINKEDLIST BNAYENGE TB HUM APNA HEAD USSE DE DENGE OR HMESHA
                                 // STACK KA TOP HOGA

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {

            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            // int top = head.data; no need to write
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(45);
        s.push(65);
        s.push(15);
        s.push(95);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}