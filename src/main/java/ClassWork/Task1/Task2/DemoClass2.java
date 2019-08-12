package ClassWork.Task1.Task2;

import java.lang.reflect.Array;

public class DemoClass2 {
    public static void main(String args[]) {
        String str = "Constructor";
        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)

        // Вывод массива на экран

        for(int i = 0; i < strToArray.length; i++) {
            System.out.println(strToArray[i]);
        }
    }
}
