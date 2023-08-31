package Part2;

/* Question 20 : Write a java program to print a triangle with odd numbers where n is representing number of rows to be print.
Input:
            n = 7;
Output:
           1
           1 3
           1 3 5
           1 3 5 7
           1 3 5 7 9
           1 3 5 7 9 11
           1 3 5 7 9 11 13
 */
public class OddNumberTriangle {
    public static void main(String[] args) {
        int n = 7; // Change this to the number of rows you want
        printNumberTriangle(n);
    }

    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int currentNumber = 1;

            // Print odd numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber += 2;
            }

            System.out.println(); // Move to the next row
        }

    }
}
