//Вывести все простые числа от 1 до 1000
package Homeworks.Homework1;

public class Task2 {
    public static void main(String[] args) {
        System.out.printf("1 ");
        for (int i = 2; i <= 1000; i++) { // Проверяем только четные, до 1000
            boolean number = false; // Создаем переменную "флаг"

            for (int j = 2; j * j <= i; j++) {
                number = (i % j == 0);
                if (number) {
                    break; // Если делится без остатка,то не проверяем дальше
                }
            }
            if (!number) {
                System.out.print(i + " ");
            }

        }
    }
}
