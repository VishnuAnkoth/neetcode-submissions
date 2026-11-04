class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> distinctNumbers = IntStream.of(nums).boxed().collect(Collectors.toSet());
        return (nums.length != distinctNumbers.size());
    }
}