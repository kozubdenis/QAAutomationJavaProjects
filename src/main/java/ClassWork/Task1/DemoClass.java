package ClassWork.Task1;


import java.util.Arrays;
import java.util.Objects;

public class DemoClass {
    public static void main(String[] args) {
        Object[] names = {"Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris", 15};
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            if (names[i] instanceof String)
                System.out.println(names[i] + "  ");
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i] instanceof Integer)
                System.out.println(names[i] + "  ");
        }
    }
}