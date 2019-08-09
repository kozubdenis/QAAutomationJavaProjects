package StringSorting;

import StringSorting.comparator.*;
import StringSorting.model.Person;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {

        String[] names = { "Denis", "Ivan", "Oleg", "Alexandr", "Nikolay",
                                    "Vsevolod", "Stanislav", "Konstantin" };
        System.out.println("Array: " + Arrays.toString(names));//before sorting by length
        Arrays.sort(names, new WordsByLength());
        System.out.println("Array with names after sorting by length: " + Arrays.toString(names));


        StringToWords stringtowords = new StringToWords();
        System.out.println("Вывод преобразованной строки:");
        stringtowords.splitString("Разбиение строки на слова с помощью разграничителя (пробел)");
        String[] array = {
                "Hello",
                "Bye",
                "Zero",
                "Main",
                "SortDemo",
                "lesson07"};

        System.out.println("Вывод оригинальной строки:");
        System.out.println(Arrays.toString(array));
        // Сортируем, используя естественный порядок для String
        // 'Естественный' определяется уже реализованным методом
        // у класса String:
        // int compareTo(String anotherString) {...}
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // Сортируем, используя нужный нам порядок.
        // 'Способ упорядочивания' мы объясняем через
        // реализацию интерфейса 'Comparator'
        Arrays.sort(array, new StringBy3LetterComparator());
        System.out.println(Arrays.toString(array));

        Person[] persons = {
                new Person(25, "Helen"),
                new Person(32, "Kolya"),
                new Person(27, "Kolya"),
                new Person(23, "Kolya"),
                new Person(27, "Kolya"),
                new Person(15, "Peter"),
                new Person(18, "Sasha"),
                new Person(74, "Boris"),
                new Person(27, "Kolya"),
                new Person(56, "Ivan"),
        };

        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sorted persons-----");
        Arrays.sort(persons, new PersonByAgeComparator());
        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sorted persons-----");
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sort by name then by age persons-----");
        Arrays.sort(persons, new PersonByNameThenByAgeComparator());
        System.out.println(Arrays.toString(persons));
    }
}
