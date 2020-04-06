package by.epam.stady.OneDimensionAlarray;

/*Дана последовательность действительных чисел a1, a2, ... , an. Заменить
* все ее члены, большие данного Z, этим числом.
*  Подсчитать количество замен*/

public class Task2 {
    public static void main(String[] args) {

        int z = 40;
        int times = 0;
        int [] array = new int [(int) (1 + Math.random() * 100)];

        for(int i = 0; i < array.length ; i++){
            array[i] = (int) ( 1 + Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] > z) {
                array[i] = z;
                times++;

            }
        }
    }
}
