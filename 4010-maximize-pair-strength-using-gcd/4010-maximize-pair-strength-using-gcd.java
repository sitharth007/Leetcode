class Solution {
    public static int gcd(int n1,int n2){
        while(n2 != 0){
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;
    }
    public long maxPairStrength(int[] nums) {
        int gcd = 1;
        int n = nums.length;
        long max_strength = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int n1 = nums[i];
                int n2 = nums[j];
                gcd = gcd(n1,n2);
                long strength = ((long)n1 * n2) / ((long)gcd * gcd);
                max_strength = Math.max(max_strength, strength);

            }
        }
        return max_strength;
    }

}