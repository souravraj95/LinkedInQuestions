package Part3;
/* Question 25 : Write a java program to find smallest palindrome which is divisible by 7 of given N digit.}
Input : 1 Output : 7
Input : 2 Output : 77
Input : 3 Output : 161

 */
public class SmallestPalindromeDivisibleBy7 {
    public static void main(String[] args) {
        int N = 1;

        int lowerBound = (int) Math.pow(10, N - 1);
        int upperBound = (int) Math.pow(10, N) - 1;
        int smallestPalindrome = -1;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 7 == 0 && isPalindrome(i)) {
                smallestPalindrome = i;
                break;
            }
        }

        if (smallestPalindrome != -1) {
            System.out.println("Smallest palindrome divisible by 7 with " + N + " digits: " + smallestPalindrome);
        } else {
            System.out.println("No palindrome divisible by 7 with " + N + " digits found.");
        }
    }

    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
