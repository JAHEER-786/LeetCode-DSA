class MyQueue {
    Stack<Integer>q1;
    Stack<Integer>q2;
    public MyQueue() {
        q1 = new Stack<>();
        q2 = new Stack<>();
    }
    
    public void push(int x) {
        q1.push(x);
    }
    
    public int pop() {
        while(!q1.isEmpty()){
            q2.push(q1.peek());
            q1.pop();
        }
        int res = q2.peek();
        q2.pop();
        while(!q2.isEmpty()){
            q1.push(q2.peek());
            q2.pop();
        }
        return res;
    }
    
    public int peek() {
         while(!q1.isEmpty()){
            q2.push(q1.peek());
            q1.pop();
        }
        int res = q2.peek();
        while(!q2.isEmpty()){
            q1.push(q2.peek());
            q2.pop();
        }
        return res;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */