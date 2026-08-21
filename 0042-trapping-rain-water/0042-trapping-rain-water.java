class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] arrleft = new int[n];
        int[] arrright = new int[n];

        arrleft[0] = height[0];

        for(int i = 1; i < n; i++)
        {
            arrleft[i] = Math.max(arrleft[i - 1], height[i]);
        }

        arrright[n - 1] = height[n - 1];

        for(int i = n - 2; i>= 0; i--)
        {
            arrright[i] = Math.max(arrright[i + 1], height[i]);
        }

        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            int waterLevel = Math.min(arrleft[i], arrright[i]);
            ans += waterLevel - height[i];
        }

        return ans;
    }
}