import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
        System.out.println("Назовите имя");
        Scanner sc = new Scanner(System.in, "cp866");
        String myName = sc.nextLine();
        // System.out.println(String.format("Здравствуйте, %s!",myName));
        System.out.printf("Здравствуйте, %s!\n",myName);
        sc.close();
    }
}
