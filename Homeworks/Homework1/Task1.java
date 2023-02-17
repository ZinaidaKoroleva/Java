package Homeworks.Homework1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) { // Проверка ввода
            int n = sc.nextInt();
            int numberTg = n * (n + 1) / 2; // Формула треугольного числа
            System.out.printf("Треугольное число %s = %s \n", n, numberTg); // Форматированный вывод
            int factorial = 1;
            for (int i = 1; i <= n; i++) { // Находим факториал с помощью цикла
                factorial *= i;
            }
            System.out.printf("Факториал числа %s = %s \n", n, factorial);
        } else {
            System.out.println("Ошибка, введено не число. Перезапустите программу");
        }
        sc.close();
    }
}
