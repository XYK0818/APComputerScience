package FRQ.Y2022.Q4;

public class Data {
    public final int MAX = 1000;
    private int[][] grid;

    public Data(int row, int col){
        this.grid = new int[row][col];
    }

    public int[][] getGrid(){
        return this.grid;
    }

    public void repopulate(){
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                int rand = (int) (Math.random() * MAX) + 1;
                while(rand % 10 != 0 || rand % 100 == 0)
                    rand = (int) (Math.random() * MAX) + 1;

                grid[r][c] = rand;
            }
        }
    }

    public int countIncreasingCols(){
        int increasingCols = 0;

        for(int c = 0; c < grid[0].length; c++)
        {
            boolean isIncreasing = true;

            for(int r = 1; r < grid.length; r++)
                if(grid[r-1][c] > grid[r][c])
                    isIncreasing = false;

            if(isIncreasing)
                increasingCols++;
        }

        return increasingCols;
    }
}
