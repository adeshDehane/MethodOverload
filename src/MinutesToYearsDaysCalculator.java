public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("invalid value" + minutes);
        } else {
            long years = (minutes / 525600);
            long days = (minutes / 1440);
            System.out.println(minutes + " min" + "= " + years + " y and " + days + " d");
        }
    }
}

