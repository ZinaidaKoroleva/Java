/** Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности. */
package Homeworks.Homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("D:\\Учеба\\Java\\Homeworks\\Homework5\\names.txt"); // открываем файл
        String peoples = new String();

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            peoples = br.readLine(); // формируем строку из файла
        }
        catch (IOException ex){
            System.err.println("Ошибка: " + ex);
        }

        countRepeats(peoples);
    }
    private static void countRepeats(String string){

        String [] names = string.split(", "); // Делаем из строки массив

        HashMap<String, Integer> namesCount = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            if (namesCount.containsKey(names[i])){ // Если словарь содержит имя,то перезаписываем и прибавляем + 1 к значению
                        int countN = namesCount.get(names[i]);
                        countN +=1;
                        namesCount.put(names[i], countN);
                    }
            else namesCount.put(names[i], 1); // Записываем значение, если его еще не было
        }

        namesCount.entrySet().stream() // сортировка
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println); 
    }
}
