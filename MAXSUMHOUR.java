public class MAXSUMHOUR {

    static int findmax(int[][]mat){
        int row = mat.length;
        int col = mat[0].length;

        if(row < 3 || col <3){
            return 0;
        }
        int res = 0;
        for(int i=0; i<row-2; i++){
            for(int j=0; j<col-2; j++){
                int sum = (mat[i][j] + mat[i][j+1] + mat [i][j+2]) + (mat[i+1][j+1]) + (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
                res = Math.max(res, sum);
            }
        }

        return res;
    }
    public static void main(String[] args){
        int[][] mat = {{2,4,0,0},
                        {0,1,1,0},
                        {4,2,1,0},{
                            0,3,0,1
                        }};

        int res = findmax(mat);
        System.out.println("Maximum sum is : "+ res);
    }
}
