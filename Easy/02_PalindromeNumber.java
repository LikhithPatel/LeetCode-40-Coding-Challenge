class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int num1=0;
        int r;
        while(num!=0){
            r=num%10;
            num1=num1*10;
            num1=num1+r;
            num=num/10;
        }
        if(num1==x){
            return true;
        }
        else{
            return false;
        }
    }
}