class Solution {
    private boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    private int makePalindrome(int num) {
        String s = Integer.toString(num);
        String ans = s + new StringBuilder(s.substring(0, s.length()-1)).reverse().toString();
        return Integer.parseInt(ans);
    }
    
    public int primePalindrome(int n) {
        if (n <= 2) return 2;
        else if (n <= 3) return 3;
        else if (n <= 5) return 5;
        else if (n <= 7) return 7;
        else if (n <= 11) return 11;
        
        int i = 1;
        while (true) {
            int palin = makePalindrome(i);
            if (palin >= n && isPrime(palin)) {
                return palin;
            }
            i++;
        }
    }
}