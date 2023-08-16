//5.5)Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrixes in Java.

import java.util.Scanner;

class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter [" + i + "" + j + "] elements: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nDisplay matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        // Calculate the sum of the left diagonal
        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        // Calculate the sum of the right diagonal
        int rightDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            rightDiagonalSum += matrix[i][2 - i];
        }

        System.out.println("Sum of the left diagonal: " + leftDiagonalSum);
        System.out.println("Sum of the right diagonal: " + rightDiagonalSum);
    }
}
