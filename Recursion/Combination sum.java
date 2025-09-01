class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<Integer>(), ans);
        return ans;
        
    }
    public static void helper(int[] ar, int target, int index, List<Integer> l, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int i=index; i<ar.length && target >=0; i++){
            if(ar[i] <= target){
                List<Integer> list = new ArrayList<>(l);
                list.add(ar[i]);
                helper(ar, target - ar[i], i, list, ans);
            }else continue;
        }
    }
}
