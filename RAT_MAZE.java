public class RAT_MAZE {
    public static boolean solveMaze(int[][] maze) {
        int n = maze.length;
        int[][] solution = new int[n][n];
        
        if (!solveMazeUtil(maze, 0, 0, solution)) {
            System.out.println("No solution exists");
            return false;
        }
        
        printSolution(solution);
        return true;
    }
    
    private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] solution) {
        int n = maze.length;

        // base case
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }
        
        if (isSafe(maze, x, y)) {
            if (solution[x][y] == 1) return false;
            
            solution[x][y] = 1;
            
            if (solveMazeUtil(maze, x + 1, y, solution)) return true;
            if (solveMazeUtil(maze, x, y + 1, solution)) return true;
            if (solveMazeUtil(maze, x - 1, y, solution)) return true;
            if (solveMazeUtil(maze, x, y - 1, solution)) return true;
            
            solution[x][y] = 0;
            return false;
        }
        return false;
    }

    
    private static boolean isSafe(int[][] maze, int x, int y) {
        int n = maze.length;
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
    }
    
    private static void printSolution(int[][] solution) {
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        
        solveMaze(maze);
    } 
}