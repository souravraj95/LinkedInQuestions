package Part3;

public class LongestSubArrayOf1S {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 1};

        int maxLen = 0;
        int left = 0;
        int countZeroOrOther = 0;
        int maxOneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                countZeroOrOther++;
            }
            while (countZeroOrOther > 1) {
                if (arr[left] != 1) {
                    countZeroOrOther++;
                }
                left++;
                countZeroOrOther--;
            }

            maxOneCount = i - left - countZeroOrOther + 1;
            maxLen = Math.max(maxLen, maxOneCount);
        }
        System.out.println(maxLen);

    }
}