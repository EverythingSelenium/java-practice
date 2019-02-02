public class ArrayExamples {
    public static void main(String[] args) {

        /**Example of a literal array declaration*/
        int[] intArray = {11, 22, 33, 44, 55};

        int x = intArray[4];

        System.out.println("intArray[4] = " + intArray[4]); //This will print the value of intArray at index -> 4
        System.out.println("x = " + x); //This will print the value of x

        //reading values from an array using a loop
        for(int i=0; i< intArray.length; i++){
            System.out.println("intArray[i] = " + intArray[i]);
        }

        int[] intArray2 = new int[7];//create an int type array of size 7

        intArray2[0] = 90;  //assigns the value 90 to the first index of intArray2
        intArray2[1] = 95;  //assigns the value 90 to the second index of intArray2
        intArray2[2] = 100;  //assigns the value 90 to the third index of intArray2

        //Print the values of array at the provided index
        System.out.println("intArray2[0] = " + intArray2[0]);
        System.out.println("intArray2[1] = " + intArray2[1]);
        System.out.println("intArray2[2] = " + intArray2[2]);

        String[] stringArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("stringArray[0] = " + stringArray[0]);
        System.out.println("stringArray[0] = " + stringArray[1]);
        System.out.println("stringArray[0] = " + stringArray[2]);

        //print string array using foreach loop
        for (String str : stringArray) {
            System.out.println("str = " + str);
        }

    }
}
