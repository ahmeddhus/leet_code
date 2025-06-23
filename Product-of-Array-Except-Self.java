class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        int r = 1;
        for (int i = n - 2; i >= 0; i--) {
            r  *= nums[i+1];
            output[i] *= r;
        }

        return output;
    }
}
