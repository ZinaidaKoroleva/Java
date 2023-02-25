/** Реализовать алгоритм сортировки слиянием. */
package Homeworks.Homework3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1,100); // Заполняем массив рандомными числами
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    
    private static void mergeSort(int[] array, int begin, int end) {
        if (begin == end) // Выход из рекурсии
            return;

        int mid = (begin + end) / 2; // Находим середину массива
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);

        int[] sortedArray = new int[array.length]; // создаем вспомогательный массив
        int inLeft = begin, inRight = mid + 1, inSorted = begin;
        int endLeft = mid + 1, endRight = end + 1;

        while (inLeft < endLeft || inRight < endRight) { // создаем цикл, с условием пока существует правая часть массива или левая
            if (inLeft < endLeft && inRight < endRight) { // пока правая и левая части не закончились, сравниваем элементы
                if (array[inLeft] < array[inRight]) // победивший элемент добавляем во вспомогательный массив и сдвигаем позицию
                    sortedArray[inSorted++] = array[inLeft++];
                else
                    sortedArray[inSorted++] = array[inRight++];
            } 
            else if (inLeft < endLeft) // Если одна из сторон закончилась,то дописываем во вспомошательный массив все элементы оставшейся
                sortedArray[inSorted++] = array[inLeft++];
            else if (inRight < endRight)
                sortedArray[inSorted++] = array[inRight++];
        }
        for (int i = begin; i <= end; i++) { // переписываем в исходный массив элементы вспомогательного
            array[i] = sortedArray[i];
        }
    }

}
