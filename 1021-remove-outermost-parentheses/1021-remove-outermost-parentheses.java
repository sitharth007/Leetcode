class Solution {
    public String removeOuterParentheses(String s) {
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        int start = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                left++;
                if(flag == 0){
                    start = i;
                    flag = 1;
                }
            }
            if(ch == ')') right++;

            if(left !=0 && right != 0 && left == right){
                sb.append(s.substring(start+1,i));
                left = 0;
                right = 0;
                flag = 0;
            }
        }
        return sb.toString();
    }
}