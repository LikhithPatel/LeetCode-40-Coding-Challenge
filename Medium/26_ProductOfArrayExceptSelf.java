class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*nums[i];
        }
        return ans;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int left=0;
//         int prod=1;
//         int[] ans=new int[nums.length];
//         for(int i=1;i<nums.length;i++){
//             prod=prod*nums[i];
//         }
//         ans[0]=prod;
//         prod=1;
//         for(int right=1;right<nums.length;right++){
//             while(left<nums.length){
//                 if(left!=right){
//                     prod=prod*nums[left];
//                 }
//                 left++;
//             }
//             ans[right]=prod;
//             prod=1;
//             left=0;
//         }
//         return ans;
//     }
// }