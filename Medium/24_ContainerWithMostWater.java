class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=Integer.MAX_VALUE;
        int waterMax=0;
        while(left<right){
            water=Math.min(height[left],height[right])*(right-left);
            waterMax=Math.max(water,waterMax);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return waterMax;
    }
}