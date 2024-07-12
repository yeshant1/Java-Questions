//leetcode-55
class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        if(n<=1) return true;
        int jump = 1;
        for(int i = n-2;i>=0;i--){

            if(nums[i] >= jump) jump = 1;
            else jump++;
        }
        return nums[0] >= jump;
    }
}
