/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: John Lau
*****************************************************************************************************
*/

public class Main {
    static java.io.PrintStream sout = System.out;
    public static void main(String[] args) {
        int add = add(6,7);
        sout.println(add);

        int addTwo = add(6,7,8,9);
        sout.println(addTwo);

        String morning = morningGreeting("Toby Fox");
        sout.println(morning);

        String afternoon = afternoonGreeting("Mac Miller");
        sout.println(afternoon);

        String tripled = triple("oohbaby");
        sout.println(tripled);  

        float half = half(19);
        sout.println(half);

        int roundedPositive = roundPositiveValueToNearestInteger(8.5);
        sout.println(roundedPositive);

        int roundedNegative = roundNegativeValueToNearestInteger(-8.5);
        sout.println(roundedNegative);
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. addTwo
    public static int add(int a, int b, int c, int d) {
        return add(add(add(a, b), c), d);
    }
    
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String str) {
        return str + str + str;
    }

    // 6. half
    public static float half(int num) {
        return num / 2.0f;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num) {
        return (int) Math.round(num);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num) {
        return (int) Math.floor(num);
    }
}
