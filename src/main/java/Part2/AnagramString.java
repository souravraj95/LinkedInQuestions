package Part2;

import java.util.Arrays;

/* Question 14: Write a java program to find given strings are Anagram or not.
Input:
           String str1 = “Tesla”;  String str2 = “Slate”;
Output:
             Yes
 */
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "Tesla";
        String str2 = "slate";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Given words are anagram");
        } else {
            System.out.println("Given words are not anagram");
        }
    }

}
