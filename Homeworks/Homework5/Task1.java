/** Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов. */
package Homeworks.Homework5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> telephoneBook = new HashMap<>();
        telephoneBook.put("Petrov Lev", List.of(4359857,3454323));
        telephoneBook.put("Lenin Petr", List.of(2224567,2227904));
        telephoneBook.put("Stoletov Maxim", List.of(3336783,9867854));
        telephoneBook.put("Nesterova Alina", List.of(4445195,12343278));
        telephoneBook.put("Trofimova Ksenia", List.of(5554367,6476678,3452341));
        telephoneBook.put("Test", List.of(111,222,333));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию и имя для поиска телефона в базе");
        String name = sc.nextLine();
        System.out.println(telephoneBook.get(name));
        sc.close();
    } 
}
