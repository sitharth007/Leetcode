class Solution {
    public int minimumDeletions(int[] nums) {

        if(nums.length == 1) return 1;

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        int i1=0 , i2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == min) i1 = i;
            if(nums[i] == max) i2 = i;
        }

        int left = Math.min(i1, i2);
        int right = Math.max(i1, i2);
        
        int front = right + 1;
        int back = nums.length - left;
        int both = (left + 1) + (nums.length - right);

        return Math.min(front, Math.min(back, both));
    }
}