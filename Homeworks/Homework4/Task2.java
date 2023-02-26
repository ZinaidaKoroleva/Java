/** 2 Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */
package Homeworks.Homework4;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list  = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.printf("Изначальный список:          %s\n", list);

        System.out.printf("Переместили элемент в конец: %s\n", enqueue(list,2));
        String firstElement = dequeue(list);
        System.out.printf("Удален первый элемент: %s\n", firstElement);
        System.out.printf("Список после dequeue:        %s\n", list);
        System.out.printf("Первый элемент списка: %s", first(list));

    }
    private static LinkedList<String> enqueue(LinkedList<String> list, int index){ // помещает элемент в конец очереди
        list.addLast(list.remove(index));
        return list;
    }

    private static String dequeue(LinkedList<String> list){ // возвращает первый элемент из очереди и удаляет его
        return list.pollFirst();
    }

    private static String first(LinkedList<String> list){ // возвращает первый элемент из очереди, не удаляя
        return list.peekFirst();
    }
}
