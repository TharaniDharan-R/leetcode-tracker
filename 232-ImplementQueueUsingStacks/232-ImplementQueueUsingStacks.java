// Last updated: 7/9/2026, 9:49:55 AM
import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1; 
    private Stack<Integer> stack2; 

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x); 
    }
    
    public int pop() {
        moveElementsIfNeeded(); 
        return stack2.pop(); 
    }
    
    public int peek() {
        moveElementsIfNeeded();
        return stack2.peek(); 
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty(); 
    }
        private void moveElementsIfNeeded() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop()); 
            }
        }
    }
}