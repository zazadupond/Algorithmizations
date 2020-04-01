package by.epam.stady.arraysofarrays;
/* Сформировать квадратнубю матрицу порядка n по правилу:
* A[I ; J] = sin ( (I2 - J2) / N) и подсчитать количество положительных элементов в ней*/

public class Task7 {
    public static void main(String[] args) {

        int count = 0;
        int n = 300;
        double [][] array = createMatrixRule(n);
        for(int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
                if (array[i][j] > 0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Положительных элементов " + count);


    }
    public static double[][] createMatrixRule(int n) {
        double x = 0;
        double y = 0;

        double[][] newMatrix = new double[n][n];

        for(int i = 0; i < newMatrix.length; i++, x++){
            for(int j = 0; j < newMatrix[i].length; j++ , y++ ){

                newMatrix[i][j] = Math.sin((Math.pow(x , 2) - Math.pow(y , 2))/ n);
            }
        }
        return newMatrix;
    }
}
