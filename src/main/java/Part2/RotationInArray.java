package Part2;
/*Question 11 : Write a java program to do a given number right rotation in a given array.
Input:
            int [] array = {1,2,3,4,5};
            int rotation = 2;
Output:
             {4,5,1,2,3}
 */

public class RotationInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotation = 2;

        rightRotate(array, rotation);

        System.out.print("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.arraycopy(rotated, 0, arr, 0, n);
    }
}
