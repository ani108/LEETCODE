class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            if(nums[start] == nums[start + 1])
                return true;

            start++;
        }

        return false;
    }
}