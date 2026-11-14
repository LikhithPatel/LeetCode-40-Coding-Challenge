class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(int x:nums){
            if(nums[i]==target){
                return i;
            }
            if(target<nums[i]){
                return i;
            }
            i++;
        }
        return nums.length;
    }
}