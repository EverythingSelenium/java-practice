public class SwitchStatementExamples {
    public static void main(String[] args) {

        int week = 2;
        String day;

        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is " + day);

        String months = "March";

        switch (months.toLowerCase()) {
            case "january":
                System.out.println("The first month.");
                break;
            case "february":
                System.out.println("The second month.");
                break;
            case "march":
                System.out.println("The third month.");
                break;
        }
    }
}
