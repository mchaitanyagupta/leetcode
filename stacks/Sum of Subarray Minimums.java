//adding the minimum number to result of each subarray possible
//same like max rectangle area histogram problem
//this require the previous smaller element and next smaller element
//if a element is smaller than adjacent elements we can add same element for x times
//here x is noof elements that greater then current element for the the next and previous smaller elements
class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        long res = 0;
        //push the 0 index into the stack
        for(int i=1; i < arr.length; i++){
            //if element is greater than peek element the push into the stack
            if(!st.isEmpty() && arr[st.peek()] < arr[i])st.push(i);
            else{
                do{
                  //else pop the element from stack and calculate the how many times we are gonna add that element
                  //this is like if one is smaller element than we are gonna add one for all subarrays where one is included

                    int popedind = st.pop();
                    long temp = (i - popedind) * (popedind - ((st.isEmpty())?-1 : st.peek()));
                    res += temp * arr[popedind];

                }while(!st.isEmpty() && arr[st.peek()] >= arr[i]);
                st.push(i);
            }
            System.out.println(res);
        }
      //if the stack is not empty then there is no next smaller element for the elements that are in the stack
        while(!st.isEmpty()){
            int popedind = st.pop();
            long temp = (arr.length - popedind) * (popedind - ((st.isEmpty())?-1 : st.peek()));
            res += temp * arr[popedind];
            System.out.println(res);
        }
        //given that for the larger values return the modulo result
        long MOD = (long) 1000000007;
        res = res % MOD;
        return (int) res;
    }
}
