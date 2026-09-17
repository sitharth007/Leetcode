class Solution {
    public boolean palin(int i,int n,StringBuilder sb){
        if(i >= n/2) return true;
        if(sb.charAt(i) != sb.charAt(n-i-1)) return false;

        return palin(i+1,n,sb);
    }
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        return palin(0,sb.length(),sb);
    }
}