class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public void swap() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        swap();
    }
    
    public int pop() {
       int front = q1.peek();
       q1.poll();
       return front; 
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */