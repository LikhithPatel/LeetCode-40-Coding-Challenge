class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int x:nums){
            xor=xor^x;
        }
        return xor;
    }
}

// class Solution {
//     public int singleNumber(int[] nums) {
//         for(int i=0;i<=nums.length-1;i++){
//             int count=0;
//             for(int j=0;j<=nums.length-1;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }