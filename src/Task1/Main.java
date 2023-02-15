package Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*1) При помощи Set создайте
перечень товаров из 5-и наименований.
2) Добавьте к перечню еще одно
наименование товара.
3) Выведите нумерованый перечень.
4) Формирование перечня, добавление
элемента и вывод результата
сделайте каждый в отдельном методе.*/
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
        set.add("Water");
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


