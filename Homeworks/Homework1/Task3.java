// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
package Homeworks.Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt(); // Вводим первое число
        sc.nextLine(); // Переход на новую строку
        System.out.println("Введите операцию: + - * / ");
        char operation = sc.next().charAt(0); // Вводим символ
        System.out.println("Введите второе число: ");
        int numTwo = sc.nextInt(); // Вводим второе число
        sc.close(); // Закрываем сканнер
        int result = 0; // Переменная с результатом
        switch (operation) { // Выбираем операцию
            case '+':
                result = numOne + numTwo;
                break;
            case '-':
                result = numOne - numTwo;
                break;
            case '*':
                result = numOne * numTwo;
                break;
            case '/':
                result = numOne / numTwo;
                break;
            default:
                System.out.println("Операция не распознана");
                break;
        }
        System.out.printf("%s %s %s = %s", numOne, operation, numTwo, result); // Форматированный вывод результата
    }
}
