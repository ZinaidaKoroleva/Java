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
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("D:\\Учеба\\Java\\Homeworks\\Homework2\\string.txt");// открываем файл
        String string = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            string = br.readLine(); // формируем строку из файла
            System.out.println(string);
        }
        catch (IOException ex){
            System.err.println("Ошибка: " + ex);
        }
        string = string.substring(1,string.length()-1); // Удаляем фигурные скобки
        string = string.replace("\"","");
        string = string.replace(":", " = \"");
        string = string.replace(",", "\",");
        String [] bloks = string.split(", "); // Разбиваем строку на массив строк по блокам данных
        System.out.println(Arrays.toString(bloks));
    }
}
