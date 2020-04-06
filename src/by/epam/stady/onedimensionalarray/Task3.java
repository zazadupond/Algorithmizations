package by.epam.stady.onedimensionalarray;

/* Дан массив действительных чисел, размерность которого N. Посчитать, сколько в нем
* отрицательных, положительных и нулевых элементов*/

public class Task3 {

    public static void main(String[] args) {

        int n = (int) (1 + Math.random() * 100);
        int[] array = new int[n];
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-50 + Math.random() * 100);
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else if (array[i] == 0) {
                zero++;
            }

        }

        System.out.println(" В массиве размером N = "+ n + " присутствуют элементы:" +
                " \n положительные " + positive +
                " \n отрицательные " + negative +
                " \n нулевые " + zero);

    }
}
