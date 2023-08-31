package Part2;

import java.util.Arrays;

/* Question 18: Write a java program to find a unique number in a given array.
Input:
           {4,7,8,5,4,5}
Output:
           {7,8}
 */
public class UniqueNumberInArray {
    public static void main(String[] args) {
        Integer[] a = {4, 7, 8, 5, 4, 5};
        for (Integer integer : a) {
            if (Arrays.asList(a).indexOf(integer) == Arrays.asList(a).lastIndexOf(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
