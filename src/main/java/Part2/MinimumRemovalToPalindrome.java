package Part2;

/* Question 16: Write a java program to find minimum removal of a character in a given string. So, string will become a palindrome.
Input:
            String str1 = “abefwba”;
Output:
            2
Explanation: If f & w remove from the string then string can be palindrome.
 */
public class MinimumRemovalToPalindrome {
    public static int minRemovals(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String s = "abewfba";
        int minRemovals = minRemovals(s);
        System.out.println("Minimum removals: " + minRemovals);
    }
}
