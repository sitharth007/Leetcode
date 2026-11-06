class Solution {
    public String firstPalindrome(String[] words) {
        
        String res = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            int left = 0;
            int right = word.length() - 1;
            int flag = 1;
            while(left < right){
                if(word.charAt(left) != word.charAt(right)){
                    flag = 0;
                    break;
                }
                left++;
                right--;
            }
            if(flag != 0){
                res += word;
                break;
            }
        }   
        return res;
    }
}