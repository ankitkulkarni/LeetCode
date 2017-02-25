public class MinStack {
    /** initialize your data structure here. */
    Deque<ListNode> stack;
    public MinStack() {
        stack = new LinkedList<ListNode>();
    }
    
    public void push(int x) {
        ListNode n = new ListNode(x);
        n.min = stack.isEmpty() ? x : Math.min(stack.peekFirst().min, x);
        stack.offerFirst(n);
    }
    
    public void pop() {
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }
        stack.poll();
    }
    
    public int top() {
        return stack.peekFirst().val;
    }
    
    public int getMin() {
        return stack.peekFirst().min;
    }
    
    private class ListNode{
        int val, min;
        ListNode next;
        private ListNode(int x){
            val = x;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */