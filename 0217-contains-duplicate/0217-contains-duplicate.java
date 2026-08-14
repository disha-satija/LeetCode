class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean ans = false;
        for(int num : nums)
        {
            if(hm.containsKey(num))
            {
                hm.put(num, hm.get(num) + 1);
                ans = true;
                break;
            }
            else
            {
                hm.put(num, 1);
            }
        }
        return ans;
    }
}