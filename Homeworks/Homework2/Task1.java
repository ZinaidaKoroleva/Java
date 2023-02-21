/** В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */
package Homeworks.Homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("D:\\Обучение\\Java\\Homeworks\\Homework2\\string.txt");// открываем файл
        String string = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            string = br.readLine(); // формируем строку из файла
        }
        catch (IOException ex){
            System.err.println("Ошибка: " + ex);
        }
        string = string.substring(1,string.length()-1); // Удаляем фигурные скобки
        string = string.replace("\"",""); // Удаляем все кавычки
        string = string.replace(",", "\","); // Ставим кавычку перед запятой
        string = string.replace(":", ":\""); // Ставим кавычку  после двоеточия
        string = string + "\""; // Добавим кавычку в конец

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM students WHERE "); // Добавляем не меняющуюся строку в начало

        String [] blocks = string.split(", "); // Разбиваем строку на массив строк по блокам данных
        
        boolean dontPrint = true;
        for (String block: blocks) {
            String[] keyValue = block.split(":"); // Разбиваем строку на подстроки "ключ":"значение"
            String key = keyValue[0];
            String value = keyValue[1];
            if (value.equals("\"null\""))  // Если значение "null", то не печатаем
                continue;
            if (!dontPrint)   // Проставляем " AND "
                sb.append(" AND ");
            sb.append(String.format("%s = %s", key, value));
            dontPrint = false;
        }
        sb.append(";"); // Добавляем ; в конец
        System.out.println(sb.toString());
    }
}
