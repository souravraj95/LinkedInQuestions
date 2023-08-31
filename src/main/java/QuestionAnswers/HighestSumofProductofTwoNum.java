package QuestionAnswers;

import java.util.Arrays;

/*Question 02 : Write a java program to find highest sum of product of two number in an array.
Input = [2,3,6,5,8] Output = (8*6)+(5*3)+2 = 65
Input = [1,1,2,3,2,3,6,5,8] Output = (8*6)+(5*3)+(3*2)+2+1+1 = 73
 */
public class HighestSumofProductofTwoNum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,8};
        int count = 0;
        int prod = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > count; i -= 2) {
            prod = prod + (arr[i] * arr[i - 1]);
        }
        for (int i = 0; i <= count; i++) {
            sum = sum + arr[i];

        }
        int result = prod + sum;
        System.out.println(result);
    }
}
