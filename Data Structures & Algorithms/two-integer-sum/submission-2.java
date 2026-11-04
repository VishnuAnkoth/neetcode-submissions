class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> indexes = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes.add(i);
                    indexes.add(j);
                }
            }
        }
        return indexes.stream().mapToInt(Integer::intValue).toArray();
    }
}
