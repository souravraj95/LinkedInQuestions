package Part1;
/*Question 03 : Write a java program to find a count of each character in a given string.
    Input = “Automation Testing” Output = a=2,u=1,t=4,o=2,m=1,i=2,n=2,e=1,s=1,g=1
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOfCharacter {
    public static void main(String[] args) {
        charCountSpecified("ababababdcfsda", 'a');
        countAllCharOccurance("abcgshdugagdhdlkadndnfakad");
        charCountUsingStream("abcgshdugagdhdlkadndnfakad");

    }

    private static void charCountUsingStream(String string) {
        Map<String, Long> count = Arrays.stream(string.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(count);
    }

    static void charCountSpecified(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurance of given Character " + ch + " is in given string " + str + " : " + count);
    }

    static void countAllCharOccurance(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            if (charCount.containsKey(str.charAt(i))) {
                charCount.put(str.charAt(i), (charCount.get(str.charAt(i))) + 1);
            } else {
                charCount.put(str.charAt(i), 1);
            }
        }
        Set<Character> characters = charCount.keySet();
        for (char ch : characters) {
            if (charCount.get(ch) >= 1) {
                System.out.print(ch + " : " + charCount.get(ch) + " , ");
            }
        }
        System.out.println();
    }
}
