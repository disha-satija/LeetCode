class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(hm1.containsKey(ch))
            {
                hm1.put(ch, hm1.get(ch) + 1);
            }
            else
            {
                hm1.put(ch, 1);
            }
        }

        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(hm2.containsKey(ch))
            {
                hm2.put(ch, hm2.get(ch) + 1);
            }
            else
            {
                hm2.put(ch, 1);
            }
        }

        if(hm1.equals(hm2))
        {
            return true;
        }
        return false;
    }
}