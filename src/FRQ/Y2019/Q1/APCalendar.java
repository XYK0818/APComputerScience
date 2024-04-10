package FRQ.Y2019.Q1;

public class APCalendar {

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int leapYears = 0;

        for(int y = year1; y <= year2; y++)
            if(isLeapYear(y))
                leapYears++;

        return leapYears;
    }

    public static int firstDayOfYear(int year) {
        return 2;
    }

    private static int dayOfYear(int month, int day, int year) {
        return 10;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int additionalDays = dayOfYear(month, day, year) - 1;
        return (firstDayOfYear(year) + additionalDays) % 7;
    }

}
