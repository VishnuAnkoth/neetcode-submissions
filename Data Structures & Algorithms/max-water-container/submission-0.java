class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int answer = 0;
        while (left < right) {
            int length = right - left;
            int height = Math.min(heights[left], heights[right]);
            int result = length * height;
            if (answer < result) {
                answer = result;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return answer;
    }
}
