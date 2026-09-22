class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        boolean exist=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j]||arr[j]==2*arr[i]) 
                    exist=true;
            }
        }
    return exist;
    }
}