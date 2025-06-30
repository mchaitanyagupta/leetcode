// have to calculate the result of the given basic mathematical equation
// it will be in string, we traverse through it
//We used variables called number, result, sign, and stack for storing the sign and previous result before entering into the brackets
//while traversing, if it is a number, we do add it to the number after multiplying by ten, this gives the number also for numbers that are more than one digit in string
//if it is an opening brace, we add the number into the result, then update the sign, then push it into the stack
//when closing brace we remove sign and previous result of the stack and then add it current result with sign multiplied
class Solution {
    public int calculate(String s) {
        s = s.strip();
        Stack<Integer> st = new Stack<>();
        int num = 0;        
        int res = 0;
        int sign = 1;
        char[] ar = s.toCharArray();
        for(int i=0; i < ar.length; i++){
            char c = ar[i];  
            if(c == ' ')continue;
            if(Character.isDigit(c)){
                num = (num * 10) + (c - '0');
            }
            else if(c == '-' || c == '+'){
                res += num * sign;
                num = 0;
                sign = (c == '+')? 1 :-1;
            }
            else if(c == '('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            }else if(c == ')'){
                res += num * sign;
                num = 0;
                sign = st.pop();
                res = st.pop() + (sign * res);
            }
        }
      //for adding the last number of the string, if last character is number thenthis step will not be done in the above steps
        res += num * sign;
        return res;
    }
}
