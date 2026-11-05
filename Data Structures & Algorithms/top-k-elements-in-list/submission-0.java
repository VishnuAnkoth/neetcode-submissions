class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> valuesFrequency = new HashMap<>();
        for (int num : nums) {
            valuesFrequency.put(num, valuesFrequency.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : valuesFrequency.keySet()) {
            int freq = valuesFrequency.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index++] = num;
                    if (index == k)
                        return result;
                }
            }
        }
        return result;
    }
}
