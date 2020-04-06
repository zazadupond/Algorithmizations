package by.epam.stady.arraysofarrays;

/* Сформировать квадратную матрицу порядка n по заданному образцу (n- четное)
 * 1   1    1  ... 1 1 1
 * 2   2    2  ... 2 2 0
 * 3   3    3  ... 3 0 0
 * .   .   .   ... . . .
 * n-1 n-1  0  ... 0 0 0
 * n   0    0  ... 0 0 0 */

public class Task5 {
    public static void main(String[] args) {
        int n = 8;
        int[][] array = createMatrixOnTheModel(n, n);

        for ( int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrixOnTheModel(int rows, int columns) {

        int[][] array = new int[rows][columns];

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i].length - i; j++) {
                    array[i][j] = i + 1;
            }
        }

        return array;
    }
}
