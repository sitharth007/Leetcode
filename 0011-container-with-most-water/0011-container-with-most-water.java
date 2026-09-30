class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length - 1;
        int max_vol = 0;
        while(left < right){
            int l = right - left;
            int b = Math.min(h[left] , h[right]);
            max_vol = Math.max(max_vol , l * b);
            if(h[left] < h[right]) left++;
            else right--;
        }
        return max_vol;
    }
}