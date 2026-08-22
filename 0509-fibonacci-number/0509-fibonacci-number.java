class Solution {
    public int fib(int n) {
        
        if(n==1) return 1;

        int num1 = 0;
        int num2 = 1;

        int next=0;
        for(int i=1;i<n;i++){
            next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        return next;
    }
}