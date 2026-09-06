class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int n_i = 0;

        int[] nums3 = new int[m+n];

        for(int i = 0;i<m+n;i++){
            if(i<m){
                nums3[i] = nums1[i];
            }
            else{
                nums3[i] = nums2[n_i];
                n_i += 1;
            }
        }
        Arrays.sort(nums3);

        double d = 0;
        int k = nums3.length;
        if(k%2 != 0){
            d = nums3[k/2];
        }
        else{
            d = (nums3[k/2] + nums3[(k/2) - 1])/2.0;
        }
        return d;
    }
}