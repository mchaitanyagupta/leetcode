//leetcode solution fot implementing queue using stacks
class MyQueue {
  //insert element into stack when we need push operation, when we need pop operation, wehave to use another stack to access the first inserted element 
    Stack<Integer> st = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
        
    }
    
    public int pop() {
      //tansferring all elements into another stack an popping the stacks gives us the pop function for the queue
      //then return all elements back to original stack
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        int poped = temp.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return poped;
    }
    
    public int peek() {
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        int pek=temp.peek();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return pek;
        
    }
    
    public boolean empty() {
        return st.isEmpty();
        
    }
}
