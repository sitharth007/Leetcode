class Solution {
    public String reversePrefix(String word, char ch) {
        int k = 0;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c == ch){
                k = i;
                break;
            }
        }
        char[] arr = word.toCharArray();
        int left = 0;
        int right = k;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        return String.valueOf(arr);
    }
}