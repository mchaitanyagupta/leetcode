//Good number is the number with n noof digits and with even digits in even positions and prime numbers in odd positions for 0-based index
//so regardless of length we we can calculate noof ways to do it
//as we know there are 5 even numbers and 4 prime numbers less than 10, why less than 10 is we can't fit 10 or more as a single digit
//so for every even place in length n we have 5, and for every odd place, we have 4 possibilities
//what we did here is count the even places and the odd multiply n/2 times, and multiply both
//means 5 * 4 * 5 * 4 * 5 * 4  = (5*5*5)*(4*4*4)
class Solution {
    public static int mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        return (int) (helper(5, even) * helper(4, odd) % mod);
    }
    public static long helper(long x, long n){
        if(n == 0)return 1;
        if(n%2 == 0)return helper((x*x) % mod, n/2);
        else return (x * helper((x*x) % mod, n/2)) % mod;
    }
}
