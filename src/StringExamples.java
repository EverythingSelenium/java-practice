public class StringExamples {

    public static void main(String args[]) {
        String str1 = "This is a long sentence to demonstrate the string examples.";
        System.out.println("str1 = " + str1);

        String str2 = new String("This is too much.");
        System.out.println("str2 = " + str2);

        char[] arr = {'A', 'R', 'R', 'A', 'Y'};
        String str3 = new String(arr);
        System.out.println("str3 = " + str3);

        System.out.println();
        System.out.println();


        int length = str1.length();
        System.out.println("length = " + length);

        boolean areEqual = str2.equals("his is too much.");
        System.out.println("areEqual = " + areEqual);

        char chatAtIndex = str1.charAt(6);
        System.out.println("chatAtIndex = " + chatAtIndex);

        boolean startsWithSomething = str1.startsWith("This");
        System.out.println("startsWithSomething = " + startsWithSomething);

        boolean endsWithSomething = str1.endsWith("les.");
        System.out.println("endsWithSomething = " + endsWithSomething);

        String upperCase = str1.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        String lowerCase = str1.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        boolean equals = str3.equals("ARRAY");
        System.out.println("equals = " + equals);

        boolean equalsIgnoreCase = str3.equalsIgnoreCase("array");
        System.out.println("equalsIgnoreCase = " + equalsIgnoreCase);

        String replacedStr = str3.replace('A', 'N');
        System.out.println("replacedStr = " + replacedStr);
        System.out.println("str3 = " + str3);

        String replaceAll = str3.replaceAll("R", "s");
        System.out.println("replaceAll = " + replaceAll);

        String str4 = " trim this ";
        String str5 = " trim this too ";
        System.out.println(str4 + str5);
        System.out.println(str4.trim() + str5.trim());

        String[] strArr = str1.split(" ");

        for (String s : strArr) {
            System.out.println("s = " + s);
        }
    }
}

