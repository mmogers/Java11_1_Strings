/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Comparing Strings
*/

public class StringComparison {
    public static void main(String[] args) {

        // We'll create some String Objects to test...
        String nullString = null;
        String stringHello1 = "Hello";  // String Literal, interned
        String stringhEllo = "hEllo";  // String Literal, interned

        // String reference, not interned
        String stringHello2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        // StringBuilder implements CharSequence, We'll test String
        // comparison methods with alternate objects.
        StringBuilder helloStringBuilder = new StringBuilder("Hello");

        //String firstString = null;   // Line 23
        //String firstString = "Hello";
        //String firstString = stringHello2;
        String firstString = stringhEllo;
        //String secondString = null;     // Line 24
        String secondString = stringHello1;
        //Object secondObject = null; // Line 25
        //Object secondObject = secondString;
        //Object secondObject = helloStringBuilder;
        Object secondObject = secondString;
        //CharSequence secondSequence = null; // Line 26
        //CharSequence secondSequence = secondString;
        //CharSequence secondSequence = helloStringBuilder;
        CharSequence secondSequence = secondString;

        //  == operand - can have null from the left
        TestEqualsOperand(firstString, secondString); //(null, null) -> (null == null) = true

        //  public boolean equals(Object anObject)
        TestEqualsMethod(firstString, secondObject);//can be null on the right side

        // ---- public boolean equalsIgnoreCase?(String anotherString)
        TestEqualsIgnoreCaseMethod(firstString, secondString); //can be null on the right side

        // ---- public boolean contentEquals?(CharSequence cs)
        TestContentEqualsMethod(firstString, secondSequence); //no null

        // ---- public int compareTo?(String anotherString)
        TestCompareToMethod(firstString, secondString); //no null

        // ----- public int compareToIgnoreCase?(String str)
        TestCompareToIgnoreCaseMethod(firstString, secondString); //no null

    }

    //  == operand
    // returns true when both objects refer to the same object, not the same value
    public static void TestEqualsOperand(String firstString, Object secondObject) {
        System.out.println(String.format("(%s == %s) = " +
                (firstString == secondObject), firstString, secondObject));

    }

    //  public boolean equals(Object anObject)
    //  returns true if references are the same,
    //  OR if parameter type is String AND the value is the same
    public static void TestEqualsMethod(String firstString, Object secondObject) {
        try {
            System.out.println(String.format("%s.equals(%s) = " +
                    (firstString.equals(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    //  public boolean equalsIgnoreCase(Object anObject)
    //  returns true if two Strings have same value ignoring case
    public static void TestEqualsIgnoreCaseMethod(String firstString, String secondObject) {
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " +
                    (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    //  public boolean contentEquals(CharSequence cs)
    //  returns true if values in String and the second passed parameter are the same.
    public static void TestContentEqualsMethod(String firstString, CharSequence secondSequence) {
        try {
            System.out.println(String.format("%s.contentEquals(%s) = " +
                    (firstString.contentEquals(secondSequence)), firstString, secondSequence));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondSequence, e.getClass().getName()));

        }
    }

    //  public int compareTo(String anotherString)
    //  Compares the value of Strings lexicographically
    public static void TestCompareToMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareTo(%s) = " +
                    (firstString.compareTo(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }

    // public int compareToIgnoreCase(String str)
    //  Compares the value of Strings lexicographically ignoring case
    public static void TestCompareToIgnoreCaseMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareToIgnoreCase(%s) = " +
                    (firstString.compareToIgnoreCase(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }
}