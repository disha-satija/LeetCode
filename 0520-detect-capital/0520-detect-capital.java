class Solution {
    public boolean detectCapitalUse(String word) {
        int length = word.length();
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < length; i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                upper++;
            }
            if(Character.isLowerCase(word.charAt(i)))
            {
                lower++;
            }
            if(length == upper || length == lower)
            {
                return true;
            }
            else if(Character.isUpperCase(word.charAt(0)) && lower == length - 1)
            {
                return true;
            }
        }
        return false;
    }
}