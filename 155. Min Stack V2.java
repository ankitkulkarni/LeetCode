public class MinStack {
    /** initialize your data structure here. */
    int currentMin;
    Deque<ListNode> stack;
    public MinStack() {
        currentMin = Integer.MAX_VALUE;
        stack = new LinkedList<ListNode>();
    }
    
    public void push(int x) {
        ListNode n = new ListNode(x);
        n.min = currentMin > x ? x : currentMin;
        stack.offerFirst(n);
        currentMin = n.min;
    }
    
    public void pop() {
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }
        stack.poll();
        if(stack.isEmpty()){
            currentMin = Integer.MAX_VALUE;
        }
        else{
            currentMin = stack.peekFirst().min;
        }
    }
    
    public int top() {
        return stack.peekFirst().val;
    }
    
    public int getMin() {
        return currentMin;
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