class Solution {
    public int[] shuffle(int[] nums, int n) {
               int[] firstMidArr = new int[nums.length / 2];
        int[] secondMidArr = new int[nums.length / 2];
        int middle = nums.length / 2;

        for (int i = 0; i < firstMidArr.length; i++) {
            firstMidArr[i] = nums[i];
            secondMidArr[i] = nums[middle];
            middle++;
        }

        int localIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = firstMidArr[localIndex];
            nums[i + 1] = secondMidArr[localIndex];
            localIndex++;
        }

        return nums;
    }
}