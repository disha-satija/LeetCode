class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int reverse = 26 - (ch - 'a');
            int real = i + 1;
            ans = ans + (reverse * real);
        }
        return ans;
    }
}