class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        boolean yes=false;
        while(Math.pow(3,x)<=n){
            if(Math.pow(3,x)==n)
                yes=true;;
            x++;
        }
    return yes;
    }
}