package lesson5.human;

/**
 * Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
 * Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах
 */

public class Main {

    public static void main(String[] args) {

        /**
         * создаем объект класса Marine, который наследует конкртетную реализацию интерфейсов
         * из абстрактного класса Human
         */

        Human marine = new Marine();

        marine.brass();
        marine.dive();
        marine.sprint();
        marine.slowPace();

        System.out.println();


        /**
         * создаем объект класса Jogger, вызываем методы, которые переопределены в самом классе
         * Jogger
         */

        Jogger jogger = new Jogger();

        jogger.brass();
        jogger.dive();
        jogger.sprint();
        jogger.slowPace();


    }
}
