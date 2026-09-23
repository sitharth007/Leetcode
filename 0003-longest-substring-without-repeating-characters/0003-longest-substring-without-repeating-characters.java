class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int max_len = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++){
            while(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(right));
            max_len = Math.max(max_len,right - left + 1);
        } 
        return max_len;
    }
}