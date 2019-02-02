public class LoopExamples {

    public static void main(String[] args) {
        forLoopExample();
        nestedForLoopExample();
        whileLoopExample();
    }

    public static void forLoopExample() {

        /*
         * for (initialization; testExpression; update) {
         * codes inside for loop's body
         * }
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
