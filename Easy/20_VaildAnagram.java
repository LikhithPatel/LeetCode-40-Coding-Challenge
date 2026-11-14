class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        if(a.length!=b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        // for(int i=0;i<=a.length-1;i++){
        //     for(int j=i+1;j<=a.length-1;j++){
        //         if(a[i]>a[j]){
        //             a[i]=(char)(a[i]^a[j]);
        //             a[j]=(char)(a[i]^a[j]);
        //             a[i]=(char)(a[i]^a[j]);
        //         }
        //     }
        // }

        // for(int i=0;i<=b.length-1;i++){
        //     for(int j=i+1;j<=b.length-1;j++){
        //         if(b[i]>b[j]){
        //             b[i]=(char)(b[i]^b[j]);
        //             b[j]=(char)(b[i]^b[j]);
        //             b[i]=(char)(b[i]^b[j]);
        //         }
        //     }
        // }
        int i=0;
        int j=a.length-1;
        while(i<=j){
            if(a[i]!=b[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}