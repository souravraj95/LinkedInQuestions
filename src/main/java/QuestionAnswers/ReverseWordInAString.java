package QuestionAnswers;

/*Question 08 : Write a java program to reverse each word in a given string.
Input = “I am a automation tester” Output = tester automation a am I
 */
public class ReverseWordInAString {
    public static void main(String[] args) {
        reverseWord("I am a automation tester");

    }

    static void reverseWord(String str) {
        String[] word = str.split(" ");
        String result = "";
        for (int i = word.length - 1; i >= 0; --i) {
            result += word[i] + " ";
        }
        System.out.println("Previous String : " + str + " Reverse String : " + result);
    }
}
