/** 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */
package Seminars.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task0 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            integerArrayList.add((int)(Math.random() * 100));
        }
        System.out.println("Заполнение ArrayList заняло " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            integerLinkedList.add((int)(Math.random() * 100));
        }
        System.out.println("Заполнение LinkedList заняло  " + (System.currentTimeMillis() - time));
    }
}
