/** Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее арифметичское этого списка. */
package Homeworks.Homework3;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>(); 
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            numbersList.add(rd.nextInt(1,25)); // Заполняем список рандомными числами
        }

        System.out.printf("Исходный список: %s\n", numbersList);

        getMinMax(numbersList); // Находим минимальное и максимальное значение

        int summ = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            summ+=numbersList.get(i); // Находим сумму элементов
        }

        int average = summ/numbersList.size(); // Считаем среднее арифметическое

        System.out.printf("Среднее арифметическое = %s", average);
    }
    private static void getMinMax(ArrayList<Integer> numbersList){
        int min = numbersList.get(0);
        int max = numbersList.get(0);

        for (int i = 1; i < numbersList.size(); i++) {
            if(numbersList.get(i)> max){
                max = numbersList.get(i);
            }
            else if (numbersList.get(i)< min){
                min = numbersList.get(i);
            }
        }
        System.out.printf("Максимальное значение = %s, минимальное значение = %s\n",max, min);
    }
}   

