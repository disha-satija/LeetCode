class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int prodleft = 1;
        int prodright = 1;
        for(int i = n - 1; i >= 0; i--)
        {
            ans[i] = prodright;
            prodright = prodright * nums[i];
        }
        for(int i = 0; i < n ; i++)
        {
            ans[i] = ans[i] * prodleft;
            prodleft = prodleft * nums[i];
        }
        return ans;
    }
}