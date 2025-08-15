public static int getSum(int a, int b) {
        
        while(b!=0){
            int temp = (a&b)<<1; //retrive the carry ones
            a = a ^ b; //retrive the sum without carry ones
            b = temp;
        }
        return a;
    }
