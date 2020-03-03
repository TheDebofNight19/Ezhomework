package lesson6.EvenLengthRemover;

import java.util.HashSet;
import java.util.Set;
public class EvenLengthRemover {

    private Set<String> removeEvenLength(Set<String> set) {

        /**
         * используем метод removeIf для удаления из сета
         * слов, длина которых делится на 2 без остатка.
         */

        set.removeIf(word -> word.length() % 2 == 0);
        return set;
    }

    public static void main(String[] args) {

        EvenLengthRemover evenLengthRemover =  new EvenLengthRemover();

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Lobo");
        stringSet.add("Ram");
        stringSet.add("Deaneries");
        stringSet.add("Bottle");
        stringSet.add("Spec");
        stringSet.add("Chara");

        System.out.println(evenLengthRemover.removeEvenLength(stringSet));
    }
}
