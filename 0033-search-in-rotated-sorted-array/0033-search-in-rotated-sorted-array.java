class Solution {
    public int search(int[] nums, int target) {
        int found=0,res=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            found=1;
            res=i;
            break;
        }
    }
    if(found==1){
        return res;
    }
    else{
        return -1;
    }
    }
}