class Solution {
    public boolean isPerfectSquare(int num) {
        for( long i=0;i*i<=num;i++){
            if(i*i==(long)num) return true;
        }
    return false;
    }
}