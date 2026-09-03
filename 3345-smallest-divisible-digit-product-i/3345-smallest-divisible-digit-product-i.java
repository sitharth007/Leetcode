class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=i+10;i++){
            int temp = i;
            int dp=1;
            while(temp!=0){
                int rem = temp%10;
                dp*=rem;
                temp/=10;
            }
            if(dp%t == 0) return i;
        }
        return -1;
    }
}