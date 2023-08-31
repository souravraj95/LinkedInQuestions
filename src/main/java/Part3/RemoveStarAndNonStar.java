package Part3;
/* Question 22: Write a java program to remove closest non-star character to its left, as well as remove star itself.
Return the string after all stars have been removed.
Input : abcd**cde*e  Output : abcde
Input : ****  Output : String has no character
Input : **asd*ff* Output : ask
*/

import java.util.Stack;

public class RemoveStarAndNonStar {
    public static void main(String[] args) {
        String s = "**asd*ff*";

        Stack<Character> stack = new Stack<>();

        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*' && !stack.isEmpty()) {

                stack.pop();
            } else {
                stack.push(c);
            }

        }
        if (stack.isEmpty()) {
            System.out.println("String has no character");
        }
        for (char c : stack) {
            str.append(c);
        }
        System.out.println(str);

    }
}
