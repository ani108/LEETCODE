class Solution {
    public boolean checkPerfectNumber(int num) {
        int x=1;
        int sum=0;
        if(num<=1) return false;
        while(x<=num/2){
            if(num%x==0)   sum+=x;
            x++;
        }
     return sum==num;
    }
}