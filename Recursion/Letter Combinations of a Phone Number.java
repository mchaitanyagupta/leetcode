//Letter combinations leetcode problem in recursion + back tracking
//We store the string array outside the function to access from the helper function
//intuition is to add character from the starting string, then pass the string to the recursive function to append next characters
//after attaching the character, we remove the last character to attach another character from the same string -> after adding "ad", we remove 'd', to add 'e'
//if we reach the end of the length, we mean we add all the characters


//solution beats 23% in all submissions, where I have used a string to add new characters and delete at the end
class Solution {
    public static String[] ar = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        helper(res, "", digits, 0);
        return res;
    }
    public void helper(List<String> res, String s, String digits, int index){
        if(index == digits.length()){
            res.add(s);
            return;
        }
        int d = digits.charAt(index) - '0';
        for(int i = 0; i < ar[d].length(); i++){
            s += ar[d].charAt(i);
            helper(res, s, digits, index + 1);
            s = s.substring(0, s.length() - 1);
        }
    }
}


//solution beats 100% for using stringbuilder instead of string
class Solution {
    public static String[] ar = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        helper(res, new StringBuilder(), digits, 0);
        return res;
    }
    public void helper(List<String> res, StringBuilder s, String digits, int index){
        if(index == digits.length()){
            res.add(s.toString());
            return;
        }
        int d = digits.charAt(index) - '0';
        for(int i = 0; i < ar[d].length(); i++){
            s.append(ar[d].charAt(i));
            helper(res, s, digits, index + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
