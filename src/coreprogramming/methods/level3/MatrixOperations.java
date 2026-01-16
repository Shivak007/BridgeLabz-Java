package coreprogramming.methods.level3;
import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // random numbers 0-9
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int sumLength = B.length;
        int[][] C = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                for(int k=0;k<sumLength;k++)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                T[j][i] = A[i][j];
        return T;
    }

    // Method to find determinant of 2x2 matrix
    public static int determinant2x2(int[][] M) {
        return M[0][0]*M[1][1] - M[0][1]*M[1][0];
    }

    // Method to find determinant of 3x3 matrix
    public static int determinant3x3(int[][] M) {
        return M[0][0]*(M[1][1]*M[2][2]-M[1][2]*M[2][1])
                - M[0][1]*(M[1][0]*M[2][2]-M[1][2]*M[2][0])
                + M[0][2]*(M[1][0]*M[2][1]-M[1][1]*M[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] M) {
        int det = determinant2x2(M);
        if(det == 0) throw new ArithmeticException("Matrix is singular!");
        double[][] inv = new double[2][2];
        inv[0][0] = M[1][1]/(double)det;
        inv[0][1] = -M[0][1]/(double)det;
        inv[1][0] = -M[1][0]/(double)det;
        inv[1][1] = M[0][0]/(double)det;
        return inv;
    }

    // Method to display integer matrix
    public static void displayMatrix(int[][] M) {
        for(int[] row : M) {
            for(int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    // Method to display double matrix
    public static void displayMatrix(double[][] M) {
        for(double[] row : M) {
            for(double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[][] A = createRandomMatrix(3,3);
        int[][] B = createRandomMatrix(3,3);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A,B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A,B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A,B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A (3x3): " + determinant3x3(A));

        try {
            System.out.println("\nInverse of 2x2 matrix:");
            int[][] C = {{4,7},{2,6}};
            displayMatrix(inverse2x2(C));
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
