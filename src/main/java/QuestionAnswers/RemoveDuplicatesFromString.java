package QuestionAnswers;

import java.util.LinkedHashSet;

/* Question 05: Write a java program to remove duplicates from a given string.
Input = “automation” Output = automin
*/
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str1 = "automation";
        String result = removeDuplicatesusingSet(str1);
        String result1 = removeDuplicatesusingindexOf(str1);
        System.out.println(result);
        System.out.println(result1);

    }

    private static String removeDuplicatesusingindexOf(String str1) {
        String resultString = new String();
        for (int i = 0; i < str1.length(); i++) {
            char charAtPosition = str1.charAt(i);
            if (resultString.indexOf(charAtPosition) < 0) {
                resultString += charAtPosition;
            }
        }
        return resultString;
    }

    private static String removeDuplicatesusingSet(String str1) {
        String resultString = "";
        LinkedHashSet<Character> ch = new LinkedHashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            ch.add(str1.charAt(i));
        }
        for (Character c : ch) {
            resultString = resultString + c;
        }
        return resultString;
    }

}
