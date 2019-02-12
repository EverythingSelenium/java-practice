public class Hello {
    public static void main(String[] args) {

        // ifStatementExamples();

        // switchStatementExamples();

        // forLoopExample();

        // nestedForLoopExample();

        // whileLoopExample();

        // arrayExample();

        /* METHODS */
        // int i = 9949;
        // int j = 9984;

        // int k = max(i, j);
        // System.out.println(max(56, 57));

        // System.out.println("The maximum of " + i + " and " + j + " is " + k);
        // System.out.println(max(i,j));

        /* VOID METHOD */
        printGrade(70.0);
        // System.out.println(printGrade(70.0));

        /*REUSABLE CODE*/

        // for(int i = 1; i <100; i++){
        // 	printTables(i);
        // }

     //   hello("Rajan", 7);

    }

    public static void hello(String name, int count){
        System.out.println("Hello " + name + " Your lucky nunber is " + count);
        // return "You are 'lucky'" + name;
    }

    public static void printTables(int tableOf){

        for(int i = 1; i < 11; i++){
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }
        System.out.println();
    }

    /*Void method*/
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

    /** Return the max of two numbers */
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    public static int addTwoInt(int a, int b) {
        int sum = 0;

        // adding two integer value.
        sum = a + b;

        // returning summation of two values.
        return sum;
    }

    public static void arrayExample() {

        /* ARRAYS LITERALS */

        // Declaring array literal
        int[] intArray = new int[] { 11, 12, 33, 45, 55, 6, 7, 58, 95, 110 };

        // int a = 0;
        // // Enhanced for loop (for each loop)
        // for (int x : intArray) {

        // System.out.println("Value at intArray[" + a + "] = " + x);
        // a++;//
        // }

        /* ARRAY size */

        // // declares an Array of integers.
        // int count = 5;
        // int[] arr;

        // // // allocating memory for 5 integers.
        // arr = new int[count];

        // // // initialize the first elements of the array
        // arr[0] = 10;

        // // // initialize the second elements of the array and so on
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // // // accessing the elements of the specified array
        // for (int i = 0; i < 6; i++){
        // 	System.out.println("Element at index " + i + " : " + arr[i]);
        // //arr[0]
        // }
        /* STRING ARRAY */

        // String[] strArr = { "Apple", "Banana", "Orange" };

        // for (int i = 0; i < strArr.length; i++) {
        // 	String element = strArr[i];
        // 	System.out.println(element);
        // }

    }

    public static void ifStatementExamples() {
        /** IF STATEMENT */
        // int num = -1;

        // if (num > 0) {
        // System.out.println("Number is positive.");
        // }
        // System.out.println("This statement is always executed.");

        /** IF ELSE STATEMENT */

        // if (num > 0)
        // System.out.println("Number is positive.");
        // else
        // System.out.println("Number is not positive.");
        // System.out.println("This statement is always executed.");

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

    public static void switchStatementExamples() {

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

    public static void forLoopExample() {

        /*
         * for (initialization; testExpression; update) { // codes inside for loop's
         * body }
         */
        int x = 5;

        for (int i = 1; i < 11; i++) {

            System.out.println(x + " x " + i + " = " + x * i);

        }

        System.out.println("The value of x outside the for loop is " + x);

    }

    public static void nestedForLoopExample() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Outer loop iteration i = " + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("Inner for loop - i = " + i + "; j = " + j);
            }
        }
    }

    public static void whileLoopExample() {
        int sum = 0, i = 100;

        while (i != 0) {

            System.out.println("The value of 'i' = " + i);

            sum += i; // sum = sum + i;

            System.out.println("The value of 'sum' is = " + sum);

            i--;

        }
    }
}
