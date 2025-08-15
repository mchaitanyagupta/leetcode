//This program is meant to divide two numbers without using the division symbol
//by counting no of divisors in dividend, we take the count and return it
// for edge case int min value or the divisor is 1 is treated specially in the beginning
public int divide(int dividend, int divisor) {
        //if divisor is no need to do anything, just return the dividend;
        if(divisor == 1)return dividend;

        //if dividend is int min value and when divided by -1 then result turns int maxvalue+1
        //for the above case, we need to send int max value, and we have  done the same in the below;
        if(dividend == Integer.MIN_VALUE && divisor == 1)return Integer.MIN_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE;
        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)?-1 : 1;

        //we removed the sign of the numbers as we store the sign of the result
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;
        //every time this loop calculates how many divisors can fit in n
        while(n >= d){
            long t = d;
            long  c = 1;
          //if one divisor cN FIT the checks for 2*divisor and it comes by left shift, and then 4times and then 8times divisor
          //respectively, we keep track of how many divisors we add by doubling the count each time
          //since the divisor d is also doubling, then we have to double the multiple
            while(n >= (t<<1)){
                t <<= 1;
                c <<= 1;
            }
            ans += c;
            n -= t;
        }
        return (int)ans * sign;
        
    }
