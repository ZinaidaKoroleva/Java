/** 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */
package Seminars.Seminar6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<Cat> myCats = new HashSet<>();

        myCats.add(new Cat("Барсик", "Артём", "Рыжий", 
           LocalDate.of(2000, 6, 15), "Рыжий"));
        myCats.add(new Cat("Тайсон", "Артём", "Рыжий", 
           LocalDate.of(2000, 6, 15), "Рыжий"));
        myCats.add(new Cat("Пушистик", "Ярослав", "Шотландская", 
           LocalDate.of(2022, 1, 11), "Чернобелый"));
        myCats.add(new Cat("Барсик", "Артём", "Рыжий", 
           LocalDate.of(2000, 6, 15), "Рыжий"));
        System.out.println(myCats);
    }   
}
