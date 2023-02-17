// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 0, 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                count++;
            else {
                if (count > maxLength) { // если текущая цепочка больше итоговой
                    maxLength = count;
                }
                count = 0;
            }
        }
        if (count > maxLength) { // если последняя цепочка больше итоговой
            maxLength = count;
        }
        System.out.println(maxLength);
    }
}
