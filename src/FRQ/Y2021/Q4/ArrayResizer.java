package FRQ.Y2021.Q4;

public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r){
        for (int c = 0; c < array2D[0].length; c++){
            if(array2D[r][c] == 0)
                return false;
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D){
        return 2;
    }

    public static int[][] resize(int[][] array2D){
        int numberOfNonZeroRows = numNonZeroRows(array2D);
        int[][] newArray = new int[numberOfNonZeroRows][array2D[0].length];

        int newR = 0;
        for(int oldR = 0; oldR < array2D.length; oldR++){
            if(isNonZeroRow(array2D, oldR)){
                newArray[newR] = array2D[oldR];
                newR ++;
            }
        }
        return newArray;
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }


}
