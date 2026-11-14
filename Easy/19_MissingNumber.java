// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<=nums.length-1;i++){
//             if(nums[i]!=i){
//                 return i;
//             }
//         }
//         return nums.length;
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int iSum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];
            iSum=iSum+i;
        }
        return iSum+nums.length-sum;
    }
}