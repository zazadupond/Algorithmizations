package by.epam.stady.onedimensionalarray;
// В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые
// кратны данному K.


public class Task1 {
    public static void main(String[] args) {

        double k = Math.random() * 100;
        int [] array = new int[(int) k];
        int summ = 0;
        System.out.println("Вывод Lenght Array " + array.length);


        for (int i = 0; i < array.length ; i ++){
            array[i] = (int) (2+ Math.random() * array.length);
            System.out.println("Вывод элемента " + i + " ---  " + array[i]);
        }


        for (int i = 0; i < array.length ; i++){
            if ((((int) k % array[i]) == 0)) {
                System.out.println("Число " + array[i] + " кратен " + array.length);
                summ += array[i];

            }

        }
        System.out.println("Сумма элементов кратных данному K. = " + summ);

    }
}
