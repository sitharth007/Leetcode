class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int ev = 0;
        int od = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[ev] = nums[i];
                ev +=2;
            }
            else{
                ans[od] = nums[i];
                od += 2;
            }
        }
        return ans;
    }
}