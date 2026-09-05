class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefix2 = new int[n];
        prefix2[n-1] = nums[n-1];
        for(int i  = n - 2; i >= 0; i--){
            prefix2[i] = Math.min(prefix2[i + 1] , nums[i]); 
        }
        
        int maxx = 0;
        for(int i = 0; i < n; i ++){
            maxx = Math.max(maxx, nums[i]);
            if(maxx - prefix2[i] <= k ){
                return i;
            }
        }
        return -1;
    }
}