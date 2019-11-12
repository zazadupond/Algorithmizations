package by.epam.stady.arraysofarrays;

/* Сформировать квадратную матрицу порядка n по заданному образцу (n- четное)
 * 1   1    1  ... 1 1 1
 * 0   1    1  ... 1 1 0
 * 0   0    1  ... 1 0 0
 * .   .   .   ... . . .
 * 0   1    1  ... 1 1 0
 * 1   1    1  ... 1 1 1 */

public class Task6 {
    public static void main(String[] args) {
        int n = 100;
        int[][] array = createMatrixOnTheModel(n, n);

        for ( int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrixOnTheModel(int rows, int columns) {

        int jCounte = 0;
        int[][] array = new int[rows][columns];

        for (int i = 0; i < array.length/2 ; i++){ // этим циклом заполняется верхняя половина матрицы единицами

            for (int j = jCounte; j < array[i].length - jCounte; j++) {
                array[i][j] = 1;
            }

            jCounte += 1;
        }

        for (int i = array.length/2 -1; i < array.length; i++){ // этим циклом заполняется нижняя половина матрицы единицами

            for (int j = jCounte ; j < array[i].length - jCounte; j++) {
                array[i][j] = 1;
            }

            jCounte -= 1;
        }

        return array;
    }
}
