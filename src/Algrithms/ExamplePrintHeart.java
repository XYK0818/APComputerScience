package Algrithms;

public class ExamplePrintHeart {
//    main() method start
    public static void main(String[] args)
    {
//        declare and initialize variable for output size
        final int size = 1;

        drawLightHeart(size);
//        drawHeavyHeart(size);

    }

    public static void drawHeavyHeart(int size){
//        nested for loop to print the upper part of Heart
        size = size * 8;
        for (int m = 0; m < size / 2; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }

            System.out.print(System.lineSeparator());
        }
//        for loop to print the lower part of Heart
        for (int m = 1; m <= size * 5 / 8; m++)
        {
            for (int n = 0; n < 3 * m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 6 * m; n++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }
    }

    public static void drawLightHeart(int size)
    {
//        declare and initialize variable for output size
        size = size * 4;

//        nested for loop to print the upper part of Heart
        for (int m = 0; m < size; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(System.lineSeparator());
        }
//        for loop to print the lower part of Heart
        for (int m = 1; m <= 2 * size; m++)
        {
            for (int n = 0; n < m; n++) {
                System.out.print("  ");
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print("* ");
            }
            System.out.print(System.lineSeparator());
        }
    }
}
