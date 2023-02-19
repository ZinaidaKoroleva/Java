import java.util.Arrays;

// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 3, 1, 1, 1, 1, 3, 3 };
        int val = 3;
        int pos = array.length - 1;
        for (int i = 0; i < pos; i++) {
            if (array[i] == val) {
                while (array[pos] == 3 && pos > i) {
                    pos--;
                }
                int temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
                pos--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
