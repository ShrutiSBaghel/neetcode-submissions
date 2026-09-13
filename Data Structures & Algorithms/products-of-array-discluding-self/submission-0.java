class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] prefixArr = new int[nums.length];
        int[] suffixArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                prefixArr[i] = 1;
                continue;
            }
            
            prefixArr[i] = prefixArr[i-1] * nums[i-1];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1) {
                suffixArr[i] = 1;
                continue;
            }
            suffixArr[i] = suffixArr[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            res[i] = prefixArr[i] * suffixArr[i];
        }

        return res;
    }
}  
