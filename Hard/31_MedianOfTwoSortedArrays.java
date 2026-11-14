class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ans=new int[m+n];
        int a=0;
        int b=0;
        int k=0;
        while(a<m && b<n){
            if(nums1[a]<nums2[b]){
                ans[k++]=nums1[a++];
            }
            else{
                ans[k++]=nums2[b++];
            }
        }
        while(a<m){
            ans[k++]=nums1[a++];
        }
        while(b<n){
            ans[k++]=nums2[b++];
        }
        
        int i=0;
        int j=ans.length-1;
        while(i<j){
            i++;
            j--;
        }
        if(i==j){
            return ans[i];
        }
        else{
            return (ans[i]+ans[j])/2.0;
        }
    }
}