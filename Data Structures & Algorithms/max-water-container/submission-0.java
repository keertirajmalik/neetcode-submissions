class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0, r = heights.length - 1;

        while (l < r) {
            int minHeight = Math.min(heights[l], heights[r]);
            System.out.println(minHeight);
            int area = minHeight * (r - l);
            if (area > maxArea) {
                maxArea = area;
            }
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
