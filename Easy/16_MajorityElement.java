class Solution {
    public int majorityElement(int[] nums) {
        int dp=nums[0];
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
           if(count==0){
                dp=nums[i];
            }
            if(nums[i]==dp){
                count++;
            }
            else{
                count--;
            }
        }
        return dp;
    }
}