package by.epam.stady.arraysofarrays;

/* Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали.*/

public class Task2 {
    public static void main(String[] args) {

        int[][] array = {
                {0,1,1,1,1,2,2,1},
                {3,0,5,6,7,8,1,8},
                {1,2,0,4,5,1,7,8},
                {3,4,5,0,1,8,9,8},
                {3,4,5,1,0,8,9,8},
                {3,4,1,6,7,0,9,8},
                {3,1,5,6,7,8,0,8},
                {1,4,5,6,7,8,9,0}};
        displayDiagonal(array);
    }

    public static void displayDiagonal( int array[][]) {

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i][i]); // вывод диагонали слева на право
            System.out.println(array[i][-(i-(array[i].length -1 ))]); // вывод диагонали справа на лево
        }

    }
}
