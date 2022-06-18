
class Solution {
    public int[] runningSum(int[] nums) {
        int[] tempList = new int[nums.length];

        for(int i = 0; i<nums.length ; i++){
            if(i == 0)
            {
                tempList[i] = nums[i];
            }
            else
            tempList[i] = nums[i]+tempList[i-1];
        }

        return tempList;
    }
}