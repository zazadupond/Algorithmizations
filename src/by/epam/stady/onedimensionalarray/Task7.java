package by.epam.stady.onedimensionalarray;

/* Даны действительные числа a1, a2, ... , an. Найти
* max( a1 | a2n , a2 | a2n-1, ... , an | an+1 ). */


public class Task7 {

    public static void main(String[] args) {

        int [] array = new int [(int) (1+ Math.random()*100)];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 201) - 100;
        }
        System.out.println("Max = " + getMaxSum(array));

    }

    public static int getMaxSum(int[] array) {

        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }
}


