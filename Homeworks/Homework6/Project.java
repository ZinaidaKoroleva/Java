/** Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */
package Homeworks.Homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Project {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("DEXP Aquilon", 4, 128, "Windows", "Silver", 
        "Intel Celeron N4020", 2, 14));
        laptops.add(new Laptop("MSI Titan", 32, 2000, "Windows", "Black", 
        "Intel Core i9-13980HX", 24, 17));
        laptops.add(new Laptop("Irbis NB270", 4, 0, "Windows", "White", 
        "Intel Celeron N4020", 2, 14));
        laptops.add(new Laptop("Tecno Megabook T1", 16, 512, "Linux", "Blue", 
        "Intel Core i5-1035G1", 4, 15));
        laptops.add(new Laptop("Apple MacBook Air", 8, 256, "macOS", "Gold", 
        "Apple M1", 8, 13));
        
        Map<Integer,String> characteristics = new HashMap<>();
        characteristics.put(1, "Oбъем оперативной памяти");
        characteristics.put(2, "Объем SSD диска");
        characteristics.put(3, "Операционная система");
        characteristics.put(4, "Цвет");
        characteristics.put(5, "Количество ядер процессора");
        characteristics.put(6, "Диагональ экрана");

        Scanner sc = new Scanner(System.in);
        String command = new String();
        boolean flag = true;
        while (flag) {
            System.out.println("Добро пожаловать в магазин ноутбуков!\n Введите клавишу:\n  1: Найти ноутбук по фильтру \n  2: Показать все ноутбуки \n   Для выхода нажмите q");
            command = sc.nextLine();
            if (command.equals("1")){
                filter(characteristics,laptops);
            }
            else if (command.equals("2")) 
                System.out.println(laptops);
            else if (command.equals("q"))
                flag=false;
        }
        sc.close();
    }
    private static void filter(Map<Integer,String> characteristics, Set<Laptop> laptops){

        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println(characteristics);

        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();

       if (command == 1){
        System.out.println("Введите объем оперативной памяти(4,8,16,32)");
        int ram = sc.nextInt();
            for (Laptop laptop : laptops) {
                if (laptop.getRam().equals(ram)) {
                    System.out.println(laptop.toString());
                } 
            }
       }
       else if (command == 2){
        System.out.println("Введите объем SSD диска(0,128,256,512,2000)");
        int ssd = sc.nextInt();
            for (Laptop laptop : laptops) {
                if (laptop.getSsd().equals(ssd)) {
                    System.out.println(laptop.toString());
                } 
            }
       }

       else if (command == 3){
        System.out.println("Введите операционную систему(Windows, Linux, macOS)");
        Scanner scan = new Scanner(System.in);
        String os = scan.nextLine();
            for (Laptop laptop : laptops) {
                if (laptop.getOperatingSystem().equals(os)) {
                    System.out.println(laptop.toString());
                } 
            }
        scan.close();
       }
       else if (command == 4){
        System.out.println("Введите цвет(White, Blue, Gold, Black, Silver)");
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
            for (Laptop laptop : laptops) {
                if (laptop.getColor().equals(color)) {
                    System.out.println(laptop.toString());
                } 
            }
        scan.close();
       }
       
       else if (command == 5){
        System.out.println("Введите количество ядер процессора(2,4,8,24)");
        int cores = sc.nextInt();
            for (Laptop laptop : laptops) {
                if (laptop.getNumberOfCores().equals(cores)) {
                    System.out.println(laptop.toString());
                } 
            }
       }
       else if (command == 6){
        System.out.println("Введите диагональ экрана(13, 14, 15, 17)");
        int screen = sc.nextInt();
            for (Laptop laptop : laptops) {
                if (laptop.getScreen().equals(screen)) {
                    System.out.println(laptop.toString());
                } 
            }
       }
        sc.close();
    }
}
