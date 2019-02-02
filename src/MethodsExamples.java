public class MethodsExamples {
    public static void main(String[] args) {

        /* METHODS */
        int a = 9949;
        int b = 9984;

        int k = max(a, b);
        System.out.println(max(56, 57));

        System.out.println("The maximum of " + a + " and " + b + " is " + k);
        System.out.println(max(a,b));

        /* VOID METHOD */
        printGrade(70.0);
        // System.out.println(printGrade(70.0));

        /*REUSABLE CODE*/

        for(int i = 1; i <100; i++){
            printTables(i);
        }

        hello("Rajan", 7);
    }

    /**
     * This method just returns a string.
     * @param name
     * @param number
     * @return
     */
    public static String hello(String name, int number){
         return "You are 'lucky'" + name + ". Your number of choice is "+ number;
    }

    /**
     * This method just takes an int and prints a table of that number
     * @param tableOf
     */
    public static void printTables(int tableOf){

        for(int i = 1; i < 11; i++){
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }
        System.out.println();
    }

    /**
     * VOID method does not have a return value. You can still have a return statement to return back to the call.
     * @param score
     */
    public static void printGrade(double score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        if (score >= 90.0) {
            System.out.println('A');

        } else if (score >= 80.0) {
            System.out.println('B');

        } else if (score >= 70.0) {
            System.out.println('C');

        } else if (score >= 60.0) {
            System.out.println('D');

        } else {
            System.out.println('F');

        }
    }

    /**
     * This method returns the maximum of two numbers passed as arguments
     * @param num1
     * @param num2
     * @return
     */
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

}
