/**Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл. */
package Homeworks.Homework2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {
    private static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("D:\\Учеба\\Java\\Homeworks\\Homework2\\logging.txt");
            logger.addHandler(fh);
        } catch (IOException er) {
            logger.log(Level.SEVERE, "Ошибка", er);
        }
        int[] array = { 5, 6, 8, 1, 2, 0, 4 };
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array){

        for (int ceiling = array.length; ceiling >=0; ceiling--) {
            for (int i = 0; i < ceiling && i + 1 < ceiling; i++)
                if (array[i]> array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    logger.log(Level.INFO, String.format("%d <-> %d, %s", array[i], array[i+1], Arrays.toString(array)));
                }
        }
        System.out.println(Arrays.toString(array));
    }
}
