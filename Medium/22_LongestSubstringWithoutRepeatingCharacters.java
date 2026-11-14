class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] a=s.toCharArray();
        int count=0;
        int max=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<=a.length-1;i++){
            count=0;
            h.clear();
            for(int j=i;j<=a.length-1;j++){
                if(h.containsKey(a[j])){
                    break;
                }
                h.put(a[j],1);
                    count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}