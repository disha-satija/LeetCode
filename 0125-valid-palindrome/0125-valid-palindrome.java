class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = clean.length();
        int i = 0;
        int j = n - 1;
        if(n == 0)
        {
            return true;
        }
        while(i<j)
        {
            if(clean.charAt(i) != clean.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}