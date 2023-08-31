package QuestionAnswers;

/*Question 09 :  Write a java program to rotate/transpose a give matrix into a 90 degree.
Input : 1 2 3     Output: 7 4 1
        4 5 6             8 5 2
        7 8 9             9 6 3
 */
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[][] rotateMatrix = new int[colLen][rowLen];

        /*Rotating matrix values to 90 degree and storing in rotateMatrix array */
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                rotateMatrix[j][rowLen - 1 - i] = matrix[i][j];
            }
        }
        /*Printing Rotated Matrix*/
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                System.out.print(rotateMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
