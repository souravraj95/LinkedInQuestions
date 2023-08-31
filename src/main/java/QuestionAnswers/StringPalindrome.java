package QuestionAnswers;
/* Questions 07: Write a java program to find a given string is a palindrome or not without using third variable.
    Input = “MADAM” Output = Yes
 */
public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeWithoutThirdVariable("MADAM"));
        stringPalindrome("abcdcba");
        subStringPalindrome("babad");
    }

    public static boolean isPalindromeWithoutThirdVariable(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    static void stringPalindrome(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            result += str.charAt(i);
        }
        if(result.equalsIgnoreCase(str)) {
            System.out.println("Given String : "+str +" is a Palindrome "+ result);
        }else {
            System.out.println("Given String : "+str +" is not a Palindrome "+ result);
        }
    }

    static void subStringPalindrome(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            result += str.charAt(i);
        }
        if(result.equalsIgnoreCase(str)) {
            System.out.println("Given String : "+str +" is a Palindrome "+ result);
        }else if(result.substring(0,2).equalsIgnoreCase(str.substring(0,2))){
            System.out.println("Given String : "+str.substring(0,2) +" is not a Palindrome "+ result.substring(0,2));
        }else if(result.substring(1,3).equalsIgnoreCase(str.substring(1,3))){
            System.out.println("Given String : "+str.substring(1,3) +" is not a Palindrome "+ result.substring(1,3));
        }
    }
}
