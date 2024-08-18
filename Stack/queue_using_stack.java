import java.util.Stack;

public class queue_using_stack {

    public static class Myqueue {
        Stack<Integer> instack;
        Stack<Integer> outstack;

        public Myqueue() {
            instack = new Stack<>();
            outstack = new Stack<>();
        }

        public void push(int data) {
            instack.push(data);
        }

        public int pop() {
            if (outstack.isEmpty()) {
                while (!instack.isEmpty()) {
                    outstack.push(instack.pop());
                }
            }
            return outstack.pop();
        }

        public int peek(){
            if (outstack.isEmpty()) {
                while (!instack.isEmpty()) {
                    outstack.push(instack.pop());
                }
            }
            return outstack.peek();
        }

        public boolean isempty(){
            return instack.isEmpty() && outstack.isEmpty();
        }

    }
    public static void main(String[] args) {
        
    }
}
