// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminars.Seminar2;

public class Task1 {
    public static void main(String[] args) {
        int number = 12;
        char s1 = 'a';
        char s2 = 'b';
        System.out.println(createAlteraitingString(s1,s2,number)); 
    }
    private static String createAlteraitingString(char c1, char c2, int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (i %2 == 0) {result.append(c1);}
            else result.append(c2);
        }
        return result.toString();
    }
}
