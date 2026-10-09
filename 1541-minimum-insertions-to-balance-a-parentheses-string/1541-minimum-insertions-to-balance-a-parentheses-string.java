class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int needed_rights = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                if (needed_rights % 2 != 0) {
                    insertions++;
                    needed_rights--;
                }
                needed_rights += 2;
            } else {
                needed_rights--;
                if (needed_rights < 0) {
                    insertions++;
                    needed_rights += 2;
                }
            }
        }
        return insertions + needed_rights;
    }
}
