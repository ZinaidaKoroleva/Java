/** В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */
package Homeworks.Homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("Homeworks\\Homework2\\file.txt");// открываем файл
        String string = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            string = br.readLine(); // формируем строку из файла
        }
        catch (IOException ex){
            System.err.println("Ошибка: " + ex);
        }
        string = string.substring(1,string.length()-1); // Удаляем квадратные скобки и остальные ненужные знаки
        string = string.replace("\"","");
        string = string.replace("{","");
        string = string.replace("}","");
        String [] persons = string.split(", "); // Разбиваем строку на массив строк
        for (String person: persons){
            String[] objects = person.split(","); // Разбиваем каждую строку в массиве на объекты

            String name = "", grade = "", subject = "";

            for (String object:objects){
                String[] keyValue = object.split(":"); // Создаем пары ключ-значение в объектах
                String key = keyValue[0];
                String value = keyValue[1];
                if (key.equals("фамилия"))
                    name = value;
                else if (key.equals("оценка"))
                    grade = value;
                else if (key.equals("предмет"))
                    subject = value;
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", name, grade,subject); // Форматированный вывод

        } 
    }
}
