package by.epam.stady.OneDimensionAlarray;

/* Задана последовательность N вещественных чисел. Вычислить сумму чисел,
* подядковые номера которых являются простыми числами.*/

public class Task6 {
    public static void main(String[] args) {

        int summat = 0;
        int[] array = new int[(int) (1 + Math.random() * 200)]; // задаем величину массива от 1 до 200

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100; // инициируем массив цислами от -100 до 100 включительно

            double s = Math.sqrt(i);
            for (int j = 2 ; j <= s; j++){
                if ((i % j) == 0) {
                    System.out.println("Не простое " + array[i]);
                    break;
                } else {
                    summat += array[i];
                    System.out.println("Добавляем  " + array[i]);
                }
            }

        }
        System.out.println("Summator " + summat);
    }
}
