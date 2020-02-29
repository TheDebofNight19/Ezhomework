package lesson6.SuperPersonComparator;

import java.util.Arrays;
import java.util.Comparator;


class SuperPersonComparator implements Comparator<Person> {

    /**
     * переопределяем метод интерфейса Comparator так, чтобы он сравнивал объекты типа Person
     * по именам, и, в случае если они совпадают, по возрасту
     * @param obj1
     * @param obj2
     * @return
     */

    @Override
    public int compare(Person obj1, Person obj2) {

        String name1 = obj1.getName();
        String name2 = obj2.getName();

        int age1 = obj1.getAge();
        int age2 = obj2.getAge();

        int c = name1.compareTo(name2);

        if(c == 0 && age1 > age2)
        {
            return 1;
        }
        if(c == 0 && age1 < age2)
        {
            return -1;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {

        SuperPersonComparator superPersonComparator = new SuperPersonComparator();

        Person[] persons = new Person[5];

        persons[0] = new Person(50, "Quentin Tarantino");
        persons[1] = new Person(79, "David Lynch");
        persons[2] = new Person(42, "Emily Blunt");
        persons[3] = new Person(23, "Quentin Tarantino");
        persons[4] = new Person(42, "Emily Blunt");

        System.out.println("Массив Persons без сортировки:\n ");
        for(int i = 0; i < persons.length; i++)
            System.out.println(persons[i].getAge() + " " + persons[i].getName());

        System.out.println();

        Arrays.sort(persons, new SuperPersonComparator());
        System.out.println("Массив Persons с сортировкой:\n ");
        for(int i = 0; i < persons.length; i++)
            System.out.println(persons[i].getAge() + " " + persons[i].getName());
    }


}