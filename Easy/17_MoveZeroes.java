class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=nums.length-1;
        for(int x:nums){
            if(x!=0){
                nums[i]=x;
                i++;
            }

        }
        while(i<=nums.length-1){
            nums[i]=0;
            i++;
        }
    }
}