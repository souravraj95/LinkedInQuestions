package Part2;

/* Question 19 : Write a java program to reverse a number using recursion.
Input : 12345
Output : 54321
 */
public class ReverseNumberUsingRecursion {
    public static void main(String[] args) {
        int number = 23;
        int reversedNumber = reverseNumber(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int num) {
        return reverseNumberHelper(num, 0);
    }

    public static int reverseNumberHelper(int remainingDigits, int reversedSoFar) {
        if (remainingDigits == 0) {
            return reversedSoFar;
        }

        int lastDigit = remainingDigits % 10;
        int updatedReversed = reversedSoFar * 10 + lastDigit;

        return reverseNumberHelper(remainingDigits / 10, updatedReversed);
    }
}
