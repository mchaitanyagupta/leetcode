class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1)return true;
        if(n < 1)return false;
        return helper(n);
        
        
    }
    public static boolean helper(int n){
        if(n%3 == 0)return helper(n/3);
        else return n == 1;
    }
}
