class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                value = value + 1;
                map.put(nums[i], value);
            } else {
                map.put(nums[i], 1);
            }
        }

        int[] result = new int[k];
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(
       Map.Entry.comparingByValue(Comparator.reverseOrder()))
       .forEach(entry ->
       sortedMap.put(entry.getKey(), entry.getValue())
   );
        int i = k;
        System.out.println("sorted " + sortedMap);
        for(int keys: sortedMap.keySet()) {
            if(k == 0) {
                break;
            }
            result[i-k] = keys;
            k--;
        }
        return result;
    }
}
