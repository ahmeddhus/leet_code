class Solution {
    public int search(int[] nums, int target) {
        int right = 0;
        int left = nums.length - 1;
        
        while(right <= left){
            if(nums[right] == target) return right;
            if(nums[left] == target) return left;
            
            right++;
            left--;
        }
        
        return -1;
    }
}