import java.util.Random;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int num;
        Random random = new Random();
        num = random.nextInt(100);
        System.out.println("the random number is: " + num);
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
