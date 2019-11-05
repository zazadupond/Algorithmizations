package by.epam.stady.OneDimensionAlarray;

/* Даны действительные числа a1, a2, ... , an. Поменять местами
* наибольший и наименьший элементы.*/

public class Task4 {
    public static void main(String[] args) {

        int n = (int) (1 + Math.random() * 10);
        int[] array = new int[n];

        int minnumber = 0;
        int maxnumber = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
            System.out.println(array[i]);

        }
        int min = array[0] ; // записываем в переменную min значение из первого элемента с массива
        int max = array[0] ;

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
        System.out.println("Min = " + min + " Max = " + max);
        array[minnumber] = max; // Присваиваем максимальное значение в найденный индекс минимального
        array[maxnumber] = min;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}