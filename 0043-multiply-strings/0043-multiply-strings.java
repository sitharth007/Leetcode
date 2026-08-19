class Solution {
    public String multiply(String num1, String num2) {
        
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int[] positions = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                
                int product = digit1 * digit2;

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = product + positions[p2];

                positions[p2] = sum % 10;
                positions[p1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : positions) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }

        return sb.toString();
    }

}