class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int index=0;
        int num=1;
        while(index+1<n){
            ans[index++]=-num;
            ans[index++]=num;
            num++;
        }
        if(index<n)
            ans[index]=0;
    return ans;
    }
}