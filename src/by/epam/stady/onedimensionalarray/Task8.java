package by.epam.stady.onedimensionalarray;
/* Дана последовательность целых чисел a1, a2, ... , an. Образовать новую последовательность,
* выбросив из иcходной те члены, которые равны min(a1, a2, ... , an).*/

public class Task8 {

    public static void main(String[] args) {

        /*int [] array = new int [(int) (1+ Math.random()*100)];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 201) - 100;
        }*/
        int [] array = {100, 100, 99, 98, 97, 1, 1, 4, 1, 5, 1}; // создаем массив
        newArray(array);

    }


    public static int [] newArray ( int array []){
        int min = array[0]; // минимальное значение в массиве
        int count = 0; // количество элементов равное минимальному
        int indexResult = 0; // индекс нового созданного массива без минимальных элементов

        for (int i = 0; i < array.length; i++){ // ищем минимальное значение
            if (array[i] <= min){
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++){ // ищем элементы равные минимальному
            if (array[i] == min){
                count++;
            }
        }

        int [] result = new int [array.length - count]; // создаем новый массив с величиной ( текущий масив - количество найденных минимальных элем.
        for (int i = 0; i < array.length; i++){
            if(array[i] != min) { // проверяем инденс на неравенство минимальному элементу
                result[indexResult] = array[i]; // если элемент не равен минимальному то кладем в новый массив
                indexResult++; // увеличиваем индекс на единицу в новом массиве.
            }
        }

        return array;
    }

}
