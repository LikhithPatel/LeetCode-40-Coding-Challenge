class Solution {
    public int maxProfit(int[] prices) {
        int minimum=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int x:prices){
            if(x<minimum){
                minimum=x;
            }
            else{
                maxProfit=Math.max(maxProfit,x-minimum);
            }
        }
        return maxProfit;
    }
}