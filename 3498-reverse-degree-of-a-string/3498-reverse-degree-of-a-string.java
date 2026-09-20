class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i = 1;
        for(int j = 0;j<s.length();j++){
            char ch = s.charAt(j);
            int rev = 26 - (ch - 'a');
            ans += (i*rev);
            i++;
        }
        return ans;
    }
}