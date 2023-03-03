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
        String peoples = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            peoples = br.readLine(); // формируем строку из файла
        }
        catch (IOException ex){
            System.err.println("Ошибка: " + ex);
        }
        // countRepeats(peoples);
        System.out.println(countRepeats(peoples));
    }
    private static Map<String, Integer> countRepeats(String string){
        string = string.replace(",","");
        String [] names = string.split(", ");

        HashMap<String, Integer> namesCount = new HashMap<>();
        int count = 1;
        for (String name: names) {
            if (namesCount.containsKey(name)){
                int countN = namesCount.get(name);
                countN +=1;
                System.out.println(countN);
                namesCount.put(name, countN);
            }
            else namesCount.put(name, count);

        }
        
        return namesCount;
    }
}
