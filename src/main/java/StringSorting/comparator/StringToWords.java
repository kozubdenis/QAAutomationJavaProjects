package StringSorting.comparator;

public class StringToWords {

    public void splitString (String str) {
        String[] words = str.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Вывод на экран
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }

}
