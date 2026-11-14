class Solution {
    public int lowerBound(int[] nums, int n, int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int upperBound(int[] nums, int n, int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerBound(nums, n, target);
        int ub=upperBound(nums,n,target);
        if(lb==n || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,ub-1};
    }
}