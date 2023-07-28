public class Unit82DArray {

    public static void main(String[] args) {
//        8.1 2D arrays
        int[][] arr = new int[3][3];

//        8.2 traversing a 2D array
        int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

//        8.3 enhanced for loop
        for(int[] row: board){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println();
        }

//        8.4 standard algorithms
        int[][] scores = {{45, 85, 75}, {97, 23, 76}};
        int maxValue = scores[0][0];
        for(int row=0; row<scores.length; row++){
            for(int col=0; col<scores[0].length; col++){
                if(scores[row][col] > maxValue){
                    maxValue = scores[row][col];
                }
            }
        }
        System.out.println(maxValue);

    }
}
