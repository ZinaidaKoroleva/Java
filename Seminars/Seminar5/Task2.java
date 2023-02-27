/** Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
package Seminars.Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String firstLine = sc.nextLine();

        System.out.println("Введите вторую строку");
        String secondLine = sc.nextLine();

        System.out.println(isomorphCheck(firstLine, secondLine));
        sc.close();
    }
     private static Boolean isomorphCheck(String x, String y){
        if (x.length() != y.length())
        return false;
        else {
            Map <Character,Character> pairs = new HashMap<>();
            
            for (int i = 0; i < x.length(); i++) {
                if (pairs.containsKey(x.charAt(i))){
                    if (pairs.get(x.charAt(i)) != y.charAt(i)){
                        return false;
                    }
                    else pairs.put(x.charAt(i), y.charAt(i));
                }
            }
            return true;
        }

     }
}
