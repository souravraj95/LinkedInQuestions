package Part2;

/* Question 17: Write a java program to remove a consecutive vowel from a given string.
Input:
          String str1 = “I am a alien”;
Output:
            am a alin
 */
public class RemoveConsecutiveVowels {
    static boolean isVow(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }

    public static void main(String[] args) {
        String str = "I am a alien";
        int i = 1;
        while (i < str.length()) {
            if ((!isVow(str.toLowerCase().charAt(i - 1))) || (!isVow(str.toLowerCase().charAt(i)))) {
                System.out.print(str.charAt(i));
            }
            i++;
        }
        System.out.println();

    }
}
