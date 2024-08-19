

public class two_dimentional {
    public static void main(String[] args) {
        int[][] a = { { 35, 25, 17 }, { 55, 12, 37 }, {1, 2, 3} };
        int[][] b = { { 23, 65, 32 }, { 44, 12, 88 }, {1, 2, 3} };
        int[][] Sum = new int[a.length][b.length];
        int row;
        int columns;
        for (row = 0; row < a.length; row++) {
            for (columns = 0; columns < a[0].length; columns++) {
                Sum[row][columns] = a[row][columns] + b[row][columns];
            }
        }
        
        System.out.println("Sum of those Two arrys are : ");
        for (row = 0; row < a.length; row++) {
            for (columns = 0; columns < a[0].length; columns++) {
                System.out.format("%d\t", Sum[row][columns]);
            }
            System.out.println("");
        }
    }
    
}
