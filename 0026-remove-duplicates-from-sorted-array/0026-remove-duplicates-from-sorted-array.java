class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int unique = 1;
        int high = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna