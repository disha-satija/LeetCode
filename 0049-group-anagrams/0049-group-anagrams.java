class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length ; i++)
        {
            String S = strs[i];
            char[] ch = S.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!hm.containsKey(key))
            {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(S);
        }
         return new ArrayList<>(hm.values());
    }
}