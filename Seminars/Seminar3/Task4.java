/**Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
 */
package Seminars.Seminar3;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList mixed = new ArrayList<String>();
        mixed.add("Hello");
        mixed.add(234);
        mixed.add(2);
        mixed.add("hi");
        mixed.add(735);
        mixed.add("world");
        System.out.println(mixed);
        for (int i = 0; i< mixed.size(); i++){
            if (mixed.get(i) instanceof Integer){
                mixed.remove(i);
                i--;
            }
        }
        System.out.println(mixed);
    }
}
