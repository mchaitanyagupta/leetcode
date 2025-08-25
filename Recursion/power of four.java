class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1)return false;
        if(n == 1)return true;
        return helper(n);
        
    }
    public static boolean helper(int n){
        if(n % 4 == 0)return helper(n/4);
        return n == 1;
    }
}


// every power of 4 is power of 2
//for power of 2 we use n&n-1 with bit manipulation so alternative power of 2s is power of 4
//so checks power of 2 and count the trailing zeros to calculate power of four
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)return false;
        if(((n&(n-1))==0) && Integer.numberOfTrailingZeros(n)%2 == 0)return true;
        return false;
        
    }
}
