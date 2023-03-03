/** Реализовать алгоритм пирамидальной сортировки (HeapSort). */
package Homeworks.Homework5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 5, -2, 1, 10, 3, 7};

        System.out.println("Исходный массив :       " + Arrays.toString(array));
        heapSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {  // Строим сортирующее дерево
            buildHeap(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {  //Удаляем элементы из корня по одному за раз и перестраиваем дерево.
            int buff = array[0];
            array[0] = array[i];
            array[i] = buff;
            buildHeap(array, i, 0);
        }
    }


    public static void buildHeap(int[] array, int heapLength, int indexMax) {

        int leftIndex = 2 * indexMax + 1;
        int rightIndex = 2 * indexMax + 2;
        int elementMaxIndex = indexMax;

        if (leftIndex < heapLength && array[leftIndex] > array[elementMaxIndex]) {
            elementMaxIndex = leftIndex;
        }

        if (rightIndex < heapLength && array[rightIndex] > array[elementMaxIndex]) {
            elementMaxIndex = rightIndex;
        }

        if (elementMaxIndex != indexMax) {
            int forSwap = array[indexMax];
            array[indexMax] = array[elementMaxIndex];
            array[elementMaxIndex] = forSwap;
            buildHeap(array, heapLength, elementMaxIndex);
        }
    }
}
