package eidi.katas;

public class K08FizzBuzz {

    /**
     * ★  10 XP
     *
     * Gib für die Zahl n zurück:
     *   "FizzBuzz", wenn n durch 3 und durch 5 teilbar ist,
     *   "Fizz", wenn n nur durch 3 teilbar ist,
     *   "Buzz", wenn n nur durch 5 teilbar ist,
     *   sonst die Zahl selbst als String, z. B. "7".
     * Tipp: "" + n macht aus einer Zahl einen String.
     */
    public static String fizzBuzz(int n) {
        boolean condition1 = (n % 3 == 0 && n % 5 == 0);
        boolean condition2 = (n % 3 == 0);
        boolean condition3 = ( n % 5 == 0);

        if (condition1){
            return "FizzBuzz";
        } else if (condition2) {
            return "Fizz";
        } else if (condition3) {
            return "Buzz";
        } else{
            return "" + n;
        }
    }
}
