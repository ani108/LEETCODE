class Solution {
    public boolean isPowerOfFour(int n) {
        int x=0;
        boolean yes=false;
        while(Math.pow(4,x)<=n){
            if(Math.pow(4,x)==n) 
                yes=true;
        x++;
        }
    return yes;
    }
}