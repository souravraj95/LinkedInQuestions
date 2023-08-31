package Part2;

/*Question 13: Write a java program to push all the zero’s present in the given array to the last.
Input:
           {1, 2, 0, 4, 3, 0, 5, 0}
Output:
           {1, 2, 4, 3, 5, 0, 0, 0}
 */
public class PushAllZerosToEndInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        usingOneLoop(arr);
        usingTwoLoop(arr);
    }

    static void usingOneLoop(int[] arr) {
        int nonIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonIndex];
                arr[nonIndex] = temp;
                nonIndex++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    static void usingTwoLoop(int[] arr) {
        int nonZeroIndex = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
