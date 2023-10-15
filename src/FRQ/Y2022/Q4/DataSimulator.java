package FRQ.Y2022.Q4;

import java.util.Arrays;

public class DataSimulator {
    public static void main(String[] args){
        Data data = new Data(3, 3);
        data.repopulate();
        int[][] dataGrid = data.getGrid();
//        System.out.println(dataGrid);
//        System.out.println(Arrays.deepToString(dataGrid));
        System.out.println(
                Arrays.deepToString(dataGrid)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
        );

        System.out.println(data.countIncreasingCols());
    }

}
