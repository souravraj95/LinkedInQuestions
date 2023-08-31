package QuestionAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Question 04: Write a java program to remove duplicates from a given array.
    Input = [2,3,6,5,8,2,3] Output = [2,3,6,5,8]
*/
public class RemoveDuplicatesFromArray {
    public static int removeDuplicateElementsOfSortedArray(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(arr);
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void removeDuplicateElementsOfUnSortedArray(int arr[], int n) {
        HashSet<Integer> uniqueelement = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueelement.add(arr[i]);
        }
        System.out.println(uniqueelement);

    }

    public static void removeDuplicateElementsOfUnSortedArray1(int arr[], int n) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i : arr) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,5,8,2,3};
        int length = arr.length;
        length = removeDuplicateElementsOfSortedArray(arr, length);
        // printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        removeDuplicateElementsOfUnSortedArray(arr, length);
        removeDuplicateElementsOfUnSortedArray1(arr, length);
    }
}
