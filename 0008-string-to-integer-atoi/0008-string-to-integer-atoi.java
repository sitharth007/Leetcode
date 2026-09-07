class Solution { 
    public int myAtoi(String s) { 
        int len = s.length(); 
        long num = 0; 
        int sign = 1; 
        int i = 0; 

        while (i < len && s.charAt(i) == ' ') { 
            i++; 
        } 

        if (i == len) return 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') { 
            if (s.charAt(i) == '-') { 
                sign = -1; 
            } 
            i++; 
        } 

        for (; i < len; i++) { 
            int digit = s.charAt(i) - '0'; 

            if (digit >= 0 && digit <= 9) { 
                if (sign == 1 && (num > (Integer.MAX_VALUE - digit) / 10)) { 
                    return Integer.MAX_VALUE; 
                } 
                if (sign == -1 && (-num < (Integer.MIN_VALUE + digit) / 10)) { 
                    return Integer.MIN_VALUE; 
                } 
                num = num * 10 + digit; 
            } else {
                break; 
            }
        } 

        return (int) (num * sign); 
    } 
}
