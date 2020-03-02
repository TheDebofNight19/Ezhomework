package lesson6.Map;

import java.util.*;

public class CheckIfUnique {


    private boolean isUnique(Map<String, String> map) {

        /**
         * создаем хэшсет Namelist, чтобы складывать туда наши пары ключ-значение
         * и использовать метод contains, который определяет, содержит ли коллекция
         * данный элемент
         */

        HashSet<String> nameList = new HashSet<>();

        /**
         * значение каждого ключа из множества ключей мапы присваиваем переменной value
         */
        for(String key : map.keySet()) {
            String value = map.get(key);

            /**
             * проверяем,  если наш хэшсэт уже содержит текущее значение value, если да - то их уже
             * два, тогда возвращаем false.
             */
            if(nameList.contains(value))
                return false;
            nameList.add(value);
        }
        return true;
    }
    public static void main(String[] args){

            CheckIfUnique checkIfUnique = new CheckIfUnique();

            Map<String, String> map1 = new HashMap<>();
            map1.put("David", "Lynch");
            map1.put("Edgar", "Right");
            map1.put("Danny", "Vilnev");
            map1.put("Francis", "Coppola");

            System.out.println(checkIfUnique.isUnique(map1));
            System.out.println();

            Map<String, String> map2 = new HashMap<>();
            map2.put("Nancy", "Sinatra");
            map2.put("Frank", "Sinatra");
            map2.put("Brett", "Hall");
            map2.put("Ryan", "Hall");

            System.out.println(checkIfUnique.isUnique(map2));
            System.out.println();

            Map<String, String> map3 = new HashMap<>();

            System.out.println(checkIfUnique.isUnique(map3));
            System.out.println();

        }

}
