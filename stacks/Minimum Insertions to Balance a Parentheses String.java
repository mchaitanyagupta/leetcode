//same missing parentheses but one opening bracket needs two closings brackets
//adding some conditions for the next element in the string 
//will check the next character in case of first closing bracket and the based next character then we decide how many insertions needed
class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int res = 0;
        char[] ar = s.toCharArray();
        for(int i=0; i < ar.length; i++){
          //pushing the opening bracket into the stack
            if(ar[i] == '(')st.push(ar[i]);
              //if character is closing bracket
            else{
              //if the stack is empty, there is matching no opening brace corresponding to closing brace 
                if(st.isEmpty()){
                  //have to check the index ensuring it is not the last character
                    if(i < ar.length-1 && ar[i+1] == ')'){
                        res++;
                        i++;
                    }
                      //if next element also opening brace then we need to increse the noof insertion by 2
                      //one insertion for opening and another for second closing brace
                    else res += 2;
                }else {
                  //if we found macthing opening brace then check the second closing brace and manage the noof insertions, in this case res
                    if(i != ar.length-1 && ar[i+1] == ')')i++;
                    else res++;
                    st.pop(); 
                }
            }
        }
      //left over stack will be multipled by two times with the stack size
      //for the sake opening braces present at the end
        res += st.size() * 2;
      //return the final result
        return res;
    }
}
