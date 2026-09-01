class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        } 
        // for(int i=1;i<=200;i++){
        //     if(i%k == 0){
        //         if(hs.contains(i)) continue;
        //         else return i;
        //     }
        // }
        int n = k;
        while(hs.contains(n)) n += k;

        return n;
    }
}