class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing=new ArrayList<>();
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==j){
               j++;
            }
            else if(nums[i]>j){
                missing.add(j);
                j++;
                i--;
            }
        }  
        while(j<=nums.length){
            missing.add(j);
            j++;
        }
    return missing;
    }
}