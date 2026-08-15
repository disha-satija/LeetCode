class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int k = 0; k < n - 1; k++)
        {
            if(k > 0 && nums[k] == nums[k - 1])
            continue;
            int i = k + 1;
            int j = n - 1;
            while(i < j)
            {
                if(nums[i] + nums[j] + nums[k] == 0)
                {
                   ans.add(List.of(nums[i], nums[j], nums[k]));
                   i++;
                   j--;
                   while(i < j && nums[i] == nums[i - 1])
                    i++;
                    while(i < j && nums[j] == nums[j + 1])
                    j--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0)
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
        }
        return ans;
    }
}