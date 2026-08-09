class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
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
        }

        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
        arr.addAll(hm.entrySet()); 

        arr.sort((a,b) -> b.getValue() - a.getValue());

        int[] last = new int[k];
        for(int i = 0; i < k ; i++)
        {
            last[i] = arr.get(i).getKey();
        }
        
        return last;
    }
}