public class MultiplyCheatSheet {

    public static void main(String[] args) {

        for(int i = 0; i <= 9; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }

            System.out.println();

        }
    }
}
