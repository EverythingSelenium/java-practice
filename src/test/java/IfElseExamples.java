public class IfElseExamples {
    public static void main(String[] args) {

        /** IF STATEMENT */
        int num = -1;

        if (num > 0) {
            System.out.println("Number is positive.");
        }
        System.out.println("This statement is always executed.");

        /** IF ELSE STATEMENT */

        if (num > 0)
            System.out.println("Number is positive.");
        else
            System.out.println("Number is not positive.");
        System.out.println("This statement is always executed.");

        /** IF ELSE IF STATEMENT */

        int number = -1;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0.");
        }

        /** NESTED IF STATEMENT */
        double num1 = 5.0, num2 = 4.5, num3 = 5.3, largestNumber;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largestNumber = num1;
            } else {
                largestNumber = num3;
            }
        } else {
            if (num2 >= num3) {
                largestNumber = num2;
            } else {
                largestNumber = num3;
            }
        }

        System.out.println("Largest number is " + largestNumber);
    }
}
