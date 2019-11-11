package by.epam.stady.arraysofarrays;

/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/
public class Task3 {

    public static void main(String[] args) {

        int row = 1;
        int column = 2;
        int[][] array = {
                {0,1,1,1,1,2,2,1},
                {3,0,5,6,7,8,1,8},
                {1,2,0,4,5,1,7,8},
                {3,4,5,0,1,8,9,8},
                {3,4,5,1,0,8,9,8},
                {3,4,1,6,7,0,9,8},
                {3,1,5,6,7,8,0,8},
                {1,4,5,6,7,8,9,0}};
        printRowAndColumn(array, row, column);
    }

    public static void printRowAndColumn( int array[][] , int row, int column) {

        for (int i = 0; i < array[row].length; i++){
            System.out.print(array[row][i]); // вывод ряда матрицы

        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i][column]); // вывод столбца матрицы
        }

    }
}
