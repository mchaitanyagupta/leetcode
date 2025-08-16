//reduce a number to 0
//if the number is odd, subtract one from it
//else divide by 2
//in both cases, we do one step, so add one to the result
//in this program, we do the step based on the number, then pass the result to the next call, add one, then return the answer
class Solution {
    public int numberOfSteps(int num) {
        if(num == 0)return 0;
        if(num%2 == 0)num /= 2;
        else num--;
        return 1 + numberOfSteps(num);
        
    }
}
