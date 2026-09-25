class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean yes=false;
        if(n==1) return yes=true;
        while(n>1){
            if(n%2!=0) return yes;
            n/=2;
        }
        if(n==1)
            return yes=true;
        return yes;
    }
}