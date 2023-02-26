/** 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */
package Homeworks.Homework4;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers  = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(1,40)); // Заполняем список рандомными числами
        }
        System.out.printf("Исходный список:     %s\n", numbers);
        System.out.printf("Перевернутый список: %s", reverse(numbers));
    }
    private static LinkedList<Integer> reverse(LinkedList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            list.add(i,list.pollLast()); // Добавляем по индексу элемент из конца списка, последний элемент удаляется
        }
        return list;
    }
}
