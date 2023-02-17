// package Java.Seminars;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * seminar1
 */
public class Seminar1 {
    public static void main(String[] args) {
        // сниппет sout:
        System.out.println("Hello, world");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.YYYY");
        System.out.println(formatter.format(now));
    }
}