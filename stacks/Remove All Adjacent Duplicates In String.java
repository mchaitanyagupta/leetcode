//using stack to track what are the elements that to check the current character
class Solution {
    public String removeDuplicates(String s) {
        char[] ar = s.toCharArray();
        Stack<Character> st = new Stack<>();
        String res = "";
//if peek element is not equal the push it to stack
      //else remove the peek element from te  stack 
      //that gives the next element to compare
      //after removing the two adjacent equal characters
        for(int i=0; i < ar.length; i++){
            if(st.isEmpty())st.push(ar[i]);
            else{
                if(st.peek() == ar[i])st.pop();
                else st.push(ar[i]);
            }
        }

      //what is left in the stack add them to result string at the end and return the string result
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
        
    }
}
