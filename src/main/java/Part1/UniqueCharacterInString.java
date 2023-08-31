package Part1;

/* Question 06 : Write a java program to find a unique characters in a given string.
    Input = “automation” Output = umin
 */
public class UniqueCharacterInString {
    public static void main(String[] args) {
        String str = "automation";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
