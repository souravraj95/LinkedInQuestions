package Part2;
/*Question 12 : Write a java program to reverse a each word in a given string.
Input:
           String str = “Hello World, How are you?”;
Output:
           olleH ,dlroW woH era ?uoy
 */

public class ReverseCharacterOfEachWord {
    public static void main(String[] args) {
        String str = "Hello World, How are you?";
        String reversed = reverseWords(str);
        System.out.println(reversed);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}
