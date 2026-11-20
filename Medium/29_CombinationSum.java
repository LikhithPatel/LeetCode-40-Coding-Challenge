class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        int sum=0;
        Arrays.sort(candidates);
        recursion(0,candidates,target,result,new ArrayList<>(),sum);
        return result;
    }
    public void recursion(int i, int[] nums, int target,List<List<Integer>> result, List<Integer> list,int sum){
        if(sum==target){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i>=nums.length || sum>target){
            return;
        }
        list.add(nums[i]);
        recursion(i+1,nums,target,result,list,sum+nums[i]);
        list.remove(list.size()-1);
        int next=i+1;
        while(next<nums.length && nums[next]==nums[i]){
            next++;
        }
        recursion(next,nums,target,result,list,sum);

    }

}
