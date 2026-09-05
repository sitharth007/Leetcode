class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for(int i  = 1; i < n; i++){
            prefix[i] = Math.max(prefix[i - 1] , nums[i]); 
        }

        int[] prefix2 = new int[n];
        prefix2[n-1] = nums[n-1];

        for(int i  = n - 2; i >= 0; i--){
            prefix2[i] = Math.min(prefix2[i + 1] , nums[i]); 
        }
        System.out.print(Arrays.toString(prefix));

        int j = 0;
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(prefix[i] - prefix2[i] <= k ){
                return i;
            }
        }
        return -1;
    }
}