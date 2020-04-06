package by.epam.stady.OneDimensionAlarray;

/* Даны целые числа a1, a2, ... , an. Вывести на печать только те числа ,
* для которых ai > i.*/

public class Task5 {
    public static void main(String[] args) {

        int [] array = new int[(int) (1 + Math.random() * 200) ]; // задаем величину массива от 1 до 200

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 201 ) - 100 ; // инициируем массив цислами от -100 до 100 включительно

            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }

}
