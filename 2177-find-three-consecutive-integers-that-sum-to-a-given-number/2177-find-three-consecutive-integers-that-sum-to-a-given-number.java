class Solution {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];
        long first = (num/3) - 1;
        long second = (num/3) ;
        long third = (num/3) + 1;

        if(first + second + third == num){
            ans[0] = first;
            ans[1] = second;
            ans[2] = third;
            return ans;
        }
        return new long[]{};
        

    }
}