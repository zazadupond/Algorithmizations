package by.epam.stady.arraysofarray;

import java.util.Scanner;

/* В числовой матрице поменять местами два столбца, т.е все элементы одного столбца поставить на соответствующие
 * им позиции другого , а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" введите номер первого столбика от 1 до 10");
		int oneColumn = scan.nextInt() - 1;
		System.out.println(" введите номер первого столбика от 1 до 10");
		int twoColumn = scan.nextInt() - 1;
		
		int[][] changeArray = null;
		
		int[][] array = {
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10}};
		
		changeArray = changeColumn(array, oneColumn, twoColumn);
		
		for(int i = 0; i < changeArray.length; i++) {
			for( int j = 0; j < changeArray[i].length; j++) {
				System.out.print(changeArray[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static int[][] changeColumn(int[][] array, int oneColumn, int twoColumn){
		
		int tempVolumeIndex; // хранит временное значение при переносе с одного индекса в другой
		
		for(int i = 0; i < array.length; i++) { // перебираем каждую строку и меняем значения эелементов между собой
			
			tempVolumeIndex = array[i][oneColumn]; // сохраняем значение первого столбца во врем переменную
			array[i][oneColumn] = array[i][twoColumn]; // копируем значение из второго столбца в первый
			array[i][twoColumn] = tempVolumeIndex; // записываем данные из временной переменной во второй слолбец
		
		}
		
		return array;
		
	}
}
