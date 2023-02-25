package Seminars.Seminar4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task2v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> list = new ArrayDeque<String>();
        String command = new String();
        while (!command.equals("q")) {
            command = sc.nextLine();
            if (command.equalsIgnoreCase("print"));{
                System.out.println(list);
            }
            if (command.equalsIgnoreCase("revert")){
                list.pop();
            }
            else {
                list.push(command);
            }
            
        }
        System.out.println(list);
    }
}
