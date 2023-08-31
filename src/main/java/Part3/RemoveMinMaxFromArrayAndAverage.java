package Part3;

import java.util.Arrays;

public class RemoveMinMaxFromArrayAndAverage {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 3, 8, 20, 1, 15};

        if (numbers.length < 3) {
            System.out.println("Array must have at least three elements.");
            return;
        }

        int[] modifiedArray = excludeMinMax(numbers);
        double average = calculateAverage(modifiedArray);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
        System.out.println("Modified Array Average: " + average);
    }

    public static int[] excludeMinMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return Arrays.stream(arr).filter(num -> num != min && num != max).toArray();
    }

    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0; // Avoid division by zero
        }

        int sum = Arrays.stream(arr).sum();
        return (double) sum / arr.length;
    }
}