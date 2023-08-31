package Part2;

/* Question 15: Write a java program to combine alternative character of a given string.
Input:
          String str1 = “Automation”; String str2 = “Testing”;
Output:
          ATuetsotmiantgion
 */
public class CombineConsecutiveStringCharacter {
    public static void main(String[] args) {
        String a = "Automation";
        String b = "Testing";
        StringBuilder output = new StringBuilder();

        int length = a.length() + b.length();

        for (int i = 0; i < length; i++) {
            if (i < a.length()) {
                output.append(a.charAt(i));
            }
            if (i < b.length()) {
                output.append(b.charAt(i));
            }
        }
        System.out.println(output);

    }
}
