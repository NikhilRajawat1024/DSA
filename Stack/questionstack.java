import java.util.Stack;

public class questionstack {
    /*
     * SO THE QUESTION IS SUPPOSE IN STACK WE HAVE
     * | 3 |
     * | 2 |
     * | 1 |
     * AND NOW WE HAVE TO INSERT THE 4 NOT ON THE TOP OF THE STACK BUT AT THE BOTTOM
     * OF THE STACK SO WHAT SHOULD YOU DO
     * 
     * IT SHOULD BE LIKE THAT
     * | 3 |
     * | 2 |
     * | 1 |
     * | 4 |
     */

    // SO TO SOLVE IT WE WILL USE RECURSION
    public static void pushAtBottom(int data,Stack<Integer> s) {

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();

        pushAtBottom(4, s);

        s.push(top); 

    }

    public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(4,stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
