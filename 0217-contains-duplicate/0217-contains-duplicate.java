class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean found = false;
        for(int num : nums)
        {
            if(hm.containsKey(num))
            {
                hm.put(num, hm.get(num) + 1);
            }
            else
            {
                hm.put(num, 1);
            }
            if(hm.get(num) > 1)
            {
                found = true;
                break;
            }
        }
        return found;
    }
}