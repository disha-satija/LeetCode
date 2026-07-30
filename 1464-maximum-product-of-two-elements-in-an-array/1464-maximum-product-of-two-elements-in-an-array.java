class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length - 1] - 1;
        int max2 = nums[nums.length - 2] - 1;
        return max1 * max2;
    }
}