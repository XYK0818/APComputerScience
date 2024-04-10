package FRQ.Y2019.Q4;

public class LightBoard {
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];

        for(int r = 0; r < lights.length; r++)
            for(int c = 0; c < lights[0].length; c++)
                if(Math.random() <= 0.4)
                    lights[r][c] = true;
    }

    public boolean evaluateLight(int row, int col){
        int onInColumn = 0;

        for (boolean[] light : lights)
            if (light[col])
                onInColumn++;

        if(lights[row][col])
        {
            if(onInColumn % 2 == 0)
                return false;
        }
        else
        {
            if(onInColumn % 3 == 0)
                return true;
        }

        return lights[row][col];
    }
}
