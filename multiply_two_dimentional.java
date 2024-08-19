public class multiply_two_dimentional {
    public static void main(String[] args) {
        int[][] matrixA = { {1,3,5}, {4, 3, 6}, {6, 8, 6} };
        int[][] matrixB = { { 1, 3, 5 }, { 4, 3, 6 }, { 6, 8, 6 } };
        //multiply on 2d arry
        int row, columns;
        int[][] result = new int[matrixA.length][matrixB.length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                for (int k = 0; k < matrixB[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        //print
        for (row = 0; row < matrixA.length; row++) {
            for (columns = 0; columns < matrixB[0].length; columns++) {
                System.out.format("%d\t", result[row][columns]);
            }
            System.out.println("");
        }
    }
    
}
