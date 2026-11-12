class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 10) two += nums[i];
            else single += nums[i];
        }
        return single != two;
    }
}