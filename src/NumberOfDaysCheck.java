import java.util.Scanner;

public class NumberOfDaysCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type year：");
        int year = scanner.nextInt();
        System.out.println("Please type month：");
        int month = scanner.nextInt();
        int dayNum = theDayNum(month);
        if(isLeapYear(year)){
            if(month == 2){
                dayNum ++;
            }
            System.out.print(year + " is leap year, ");
        }else{
            System.out.print(year + " is not leap year,");
        }
        System.out.println(year + "/" + month + " has " + dayNum + " days");
    }

    public static boolean isLeapYear(int year) {
        if((year % 4 ==0 && year % 100 !=0) || year%400 ==0){
            return true;
        }else{
            return false;
        }
    }

    public static int theDayNum(int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                System.out.println("Error: We got a wrong month! ");
                return 0;
        }
    }
}
