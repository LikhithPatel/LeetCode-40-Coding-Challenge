class Solution {
    public int lengthOfLastWord(String s) {
        char[] a=s.toCharArray();
        if(a.length==0) return 0;
        int count=0;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==32){
                if(count>0){
                    return count;
                }
            }
            else{
                count++;
            }
        }
        return count;
    }
}