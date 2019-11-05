package by.epam.stady.OneDimensionAlarray;

/* Даны действительные числа a1, a2, ... , an. Поменять местами
* наибольший и наименьший элементы.*/

public class Task4 {
    public static void main(String[] args) {

        int n = (int) (1 + Math.random() * 100);
        int[] array = new int[n];
        int min = 100;
        int max = 0;
        int minnumber = 0;
        int maxnumber = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minnumber = i; // индекс элемента в массиве где найдено минимальное число

            }
            if (array[i] > max) {
                max = array[i];
                maxnumber = i; // индекс элемента в массиве где найдено максимальное число
            }

        }
        System.out.println(min + "  " + max);
        array[minnumber] = max;
        array[maxnumber] = min;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}