/** Пусть дан произвольный список целых чисел. Удалить из него чётные числа. */
package Homeworks.Homework3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            numbersList.add(rd.nextInt(0,10)); // Заполняем список рандомными числами
        }
        System.out.printf("Исходный список: %s\n", numbersList);
        System.out.printf("Новый список: %s", sortedList(numbersList));
    }
    private static ArrayList sortedList(ArrayList<Integer> numbersList) {   // Функция, удаляющая четные цифры
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0){
                numbersList.remove(i);
                i--;
            }
        }
        return numbersList;
    }
}
