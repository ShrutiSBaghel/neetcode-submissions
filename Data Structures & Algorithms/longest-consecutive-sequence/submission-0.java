class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int currNum;
        int res= 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int num: set) {
            if(!set.contains(num - 1)) {
                currNum = num;
                int length = 1;

                while(set.contains(currNum + 1)) {
                    length++;
                    currNum++;
                }
                res = Math.max(res, length);
            }
        }

        return res;
    }
}
