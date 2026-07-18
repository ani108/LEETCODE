class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude=new int[gain.length+1];
        altitude[0]=0;
        int max=0;
        for(int i=1;i<altitude.length;i++){
            for(int j=0;j<i;j++){
                altitude[i]+=gain[j];
            }
        }
        for(int i=0;i<altitude.length;i++){
            if(altitude[i]>max)
                max=altitude[i];
        }
    return max;
    }
}