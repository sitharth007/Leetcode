class Solution {
    public int sumOfUnique(int[] nums) {
        
        int[] fr = new int[101];

        for(int i=0;i<nums.length;i++){
            fr[nums[i]]++;
        }
        int res=0;
        for(int i=0;i<fr.length;i++){
            if(fr[i]==1){
                res = res + i;
            }
        }
        return res;
    }
}