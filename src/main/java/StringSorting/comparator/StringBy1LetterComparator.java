package StringSorting.comparator;

import java.util.Comparator;

public class StringBy1LetterComparator implements Comparator<String> {
    private static final int INDEX_LETTER = 0;

    @Override
    public int compare(String s1, String s2) {
        char c1 = s1.charAt(INDEX_LETTER);
        char c2 = s2.charAt(INDEX_LETTER);

        if (c1 == c2)
            return 0; // равны

        if (c1 < c2)
            return -1; // с1 и с2 уже упорядочены
        else
            return 1; // для с1 и с2 необходимо поменять порядок
    }
}
