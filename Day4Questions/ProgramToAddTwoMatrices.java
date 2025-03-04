package Day4Questions;

public class ProgramToAddTwoMatrices {
    int [][]matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int [][]matrix2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
    int [][]result = new int[3][3];

    public void addMatrices() {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public void printMatrix(int [][]matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProgramToAddTwoMatrices program = new ProgramToAddTwoMatrices();
        System.out.println("Matrix 1: ");
        program.printMatrix(program.matrix1);
        System.out.println("Matrix 2: ");
        program.printMatrix(program.matrix2);
        program.addMatrices();
        System.out.println("Result: ");
        program.printMatrix(program.result);
    }
}

