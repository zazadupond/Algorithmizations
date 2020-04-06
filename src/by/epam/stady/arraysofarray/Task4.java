package by.epam.stady.arraysofarrays;

public class Task4 {

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
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int z = 0; z < array[i].length; z++) {
                    array[i][z] = array[i].length - z;
                }
            }
        }

        return array;
    }

}
