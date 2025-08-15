//This program is meant to find the difference character of two strings
//two strings are shuffled and one character added in the second cahracter
//this is done by using the xor operation, since it has the property
//1^2^3^4^5^6)^(1^2^4^5^6) we get the result as 3
public static char findTheDifference(String s, String t) {
        if(s.length() == 0)return (char) t.charAt(0);
        char ans = t.charAt(0);
        for(int i=1;i<t.length();i++){
            ans ^= t.charAt(i);
            ans ^= s.charAt(i-1);
        }
        return ans;
        
    }
