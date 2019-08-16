package ClassWorkList;

import java.util.*;

import StringSorting.model.Person;

public class ListSorting {

    // TODO - конвертировать List в массив
    public static Person[] convertListToArray(List<Person> list) {
        Person[] array = list.toArray(new Person[list.size()]);
        return array;
    }

    // TODO - конвертировать массив в List
    public static List<Person> convertArrayToList(Person[] peopleArray) {
        List<Person> list = Arrays.asList(peopleArray);
        return list;

    }

    // TODO - конвертировать массив в Map в качестве ключа взять поле id
    public static Map<Long, Person> convertArrayToMap(Person[] peopleArray) {
        HashMap<Long, Person> m = new HashMap<>();
        for (int i = 0; i < peopleArray.length; i++) {
            Long key = peopleArray[i].getId();
            Person val = peopleArray[i];
            m.put(key, val);
        }
        return m;
    }

     // TODO - проверить, равны ли два списка
        public static boolean checkEqualLists(List<Person> list, List<Person> list2){
            Collections.sort(list);
            Collections.sort(list2);
            Boolean result = (list.equals(list2));
            return result;
        }



    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1L, 10, "Helen"));
        list.add(new Person(3L, 16, "Nina"));
        list.add(new Person(5L, 33, "Tom"));

        System.out.println(list);

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person(1L, 11, "Helen"));
        list2.add(new Person(4L, 60, "Oleg"));
        list2.add(new Person(5L, 33, "Tom"));

        System.out.println(list2);

        Person[] peopleArray = convertListToArray(list);

        System.out.println(Arrays.toString(peopleArray));
        System.out.println(convertArrayToList(peopleArray));
        System.out.println(convertArrayToMap(peopleArray));
        System.out.println(checkEqualLists(list, list2));
    }
}