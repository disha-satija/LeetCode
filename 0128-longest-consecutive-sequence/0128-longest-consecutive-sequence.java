// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> hs = new HashSet<>();
//         int count = 0;
//         int max = 0;
//         for(int num : nums)
//         {
//             if(hs.contains(nums[num] + 1))
//             {
//                 count++;
//             }
//             else
//             {
//                 max = 
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        Arrays.sort(nums);
        int count = 0;
        int max = 0;
        for(int i = 0; i < n - 1; i++)
        {
            if(nums[i + 1] == nums[i] + 1)
            {
                count++;
            }
            else if (nums[i + 1] == nums[i]) {
                continue;
            }
            else
            {
                max = Math.max(max, count);
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max + 1;
    }
}