package by.epam.stady.arraysofarray;

/* Дана матрица. Вывести на экран все нечетные столбцы,
* у которых первый элемент больше последнего.*/
public class Task1 {
    public static void main(String[] args) {

        int[][] array = {{15,16,17,18,19,20,21,3},
                          {3,4,5,6,7,8,9,8},
                          {1,2,3,4,5,6,7,8}};
        oddColumn(array);
    }

    public static void oddColumn (int[][] array) {

        int i = 0;
        for (int j = 0; j < array[i].length; j++){
            if ((j % 2) != 0) {
                if (array[0][j] > array[array.length - 1][j]) {
                    for (int z = 0; z < array.length; z++){
                        System.out.println(array[z][j]);

                    }
                }
            }
        }
    }
}
