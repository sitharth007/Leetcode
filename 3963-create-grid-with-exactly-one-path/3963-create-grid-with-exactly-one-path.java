class Solution {
    public String[] createGrid(int m, int n) {
        char[][] mat = new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(mat[i],'#');
        }
        int i = 0;
        int j = 0;

        while(i < m && j < n){
            mat[i][j] = '.';
            if(j == n-1){
                i++;
            }
            else{
                j++;
            }

        }
        String[] res = new String[m];

        for(int a=0;a<m;a++){
            String row = "";
            for(int b=0;b<n;b++){
                row += mat[a][b];
            }
            res[a] = row;
        }
        return res;
    }
}