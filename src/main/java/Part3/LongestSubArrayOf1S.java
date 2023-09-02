package Part3;
/*Question 23 : Write a java program to find out longest sub array of 1’s and only one delete is allowed.
Input : {1,1,0,1} Output : 3
Input : {1,1,0,0,1} Output : 2

 */
public class LongestSubArrayOf1S {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1};

        int maxLen = 0;
        int left = 0;
        int zeroCount = 0;


        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            // If zeroCount becomes greater than 1, we need to move the left pointer
            // to maintain only one deletion allowed.
            while (zeroCount > 1) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen - 1);

    }
}