class Solution {
    public int mostWordsFound(String[] s) {
        int max_len = 0;
        for(String word:s){
            int len = 1;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i) == ' '){
                    len++;
                }
            }
            max_len = Math.max(max_len,len);
            
        }
        return max_len;
    }
}