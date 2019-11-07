package by.epam.stady.OneDimensionAlarray;
/* В массиве целых чисел с количеством элементов n найти часто встречающееся число.
* Если таких чисел несколько, то определить наименьшее из них.*/

public class Task9 {

    public static void main(String[] args) {

        int [] arrays = {100, 100, 100, 1, 1, 1};
        oftenNumMin(arrays);
    }

    public static void oftenNumMin ( int [] array){
        int res = 0;
        int[] counts = new int[array.length]; // создаем новый массив с величиной как у переданного в метод
        for (int i = 0;i < array.length; i++) // перебираем все элементы массива по очереди
        {
            int count = 1; // хранит сколько элементов одинаковые
            for (int j = i + 1; j < array.length; j++) { // перебираем все элементы массива начиная с второго
                if (array[i] == array[j]) { // сравниваем каждый элемент с каждым ( первый с овсеми, второй со всеми)
                    count++; // если элементы равны, то увеличиваем счетчик
                }
            }
            counts[i]=count;

            System.out.println("counts[i] "+ counts[i]);
            System.out.println("counts[res] "+ counts[res]);


            if (counts[i]==counts[res]) { // сравниваем значения переменных по индексу
                res = array[res] > array[i] ? i : res; // сохраняем наименьшее число
            } else {
                res = count > counts[res] ? i : res;
            }
        }
           // return array[res];
        System.out.println("res " + res);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
