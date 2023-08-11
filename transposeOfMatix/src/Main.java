
public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3, 4}, {5, 6, 4}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposMatrix = new int[3][2];
        System.out.println(matrix1.length);//row
        System.out.println(matrix1[0].length);//col
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                transposMatrix[j][i] = matrix1[i][j];
            }
        }
        display(matrix1);
        display(transposMatrix);
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                transposMatrix[j][i] = matrix2[i][j];
            }
        }
        display(matrix2);
        display(transposMatrix);

    }

    public static void display(int[][] dispaymatrix) {
        System.out.println("----------------");
        for (int[] row : dispaymatrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}