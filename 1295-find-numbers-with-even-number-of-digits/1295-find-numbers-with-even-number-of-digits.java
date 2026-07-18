class Solution {
    public int findNumbers(int[] nums) {
        int[] arr=new int[nums.length];
        int count1=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                count++;
            }
        arr[i]=count;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                count1++;
        }
    return count1;
    }
}