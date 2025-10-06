public class N_Queens {

    public static boolean solveNQueen(int n){
        int [][] board = new int [n][n];

        if(solveUtil(board,0,n)){
            printB(board,n);
            return true;
        }else{
            System.out.println("Solution not exist");
            return false;
        }

    }

    public static boolean solveUtil(int [][] board, int col, int n){
        // base case
        if(col >= n){
            return true;
        }

        for(int row =0; row<n; row++){
            if(issafe(board,row,col,n)){
                board[row][col] = 1;

                // recursive maar doo kr lega apna

                if(solveUtil(board, col+1, n)){
                    return true;
                }

                board[row][col] =0; //backtrack
            }
        }

        return false;
    }


    private static boolean issafe(int[][] board, int row, int col, int n){
        // check left, check upper daagonal and lower diagonal

        for(int i=0; i<n; i++){
            if(board[row][i] == 1){
                return false;
            }
        }

        int r,c;

        for(r = row, c = col; r>=0 && c >= 0; r--,c--){
            if(board[r][c] == 1){
                return false;
            }
        }
        for(r = row, c = col; r <n && c >= 0; r++,c--){
            if(board[r][c] == 1){
                return false;
            }
        }

        return true;
    }

    private static void printB(int[][]b, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(b[i][j] == 1){
                    System.out.println("Q");
                }else{
                    System.out.println("_");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;

        solveNQueen(n);
    }
}
