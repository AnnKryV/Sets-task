package Task2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*1) При помощи Set создайте
перечень товаров из 5-и наименований.
2) Удалите из перечня один
элемент, при условии его
наличия в перечне.
3) Выведите нумерованый перечень.
4) Формирование перечня, удаление
элемента и вывод результата
сделайте каждый в отдельном методе.
*/
    public static void main(String[] args) {
        numberedOut(newName(getSet()));
    }
    private static Set<String> getSet(){
        Set<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Potato");
        set.add("Strawberry");
        set.add("Lemon");
        set.add("Cucumber");
        return  set;
    }
    private static Set<String> newName(Set<String> set) {
        set.remove("Potato");
        return set;
    }


    private static void numberedOut(Set<String> set){
        int count = 0;

        for (String num : set) {
            count++;
            System.out.println(count + "."+ num);
        }
    }
}




