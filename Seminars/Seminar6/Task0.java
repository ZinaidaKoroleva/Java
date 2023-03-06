/** 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 */
package Seminars.Seminar6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task0 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(List.of(1,2,3,2,4,5,6,3));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet  = new LinkedHashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet  = new TreeSet<>(List.of(5, 6, 3, 2, 1, 4, 6, 3));
        System.out.println(treeSet);

    }
}
