package lesson4.Final;

public final class IceAndFire {

    /**
     * в качестве примера использования модификатора final, сделаем final класс, объявим в нем
     * переменные типа final
     */

    final String name;
    final String house;
    final int age;

        public IceAndFire() {

            /**
             * мы можем инициализировать переменные в конструкторе, и,
             * после того как конструктор отработает, переменным будут присвоены значения,
             * которые уже нельзя будет изменить, обращаясь напрямую к переменным final
             */

            name = "John Snow";
            house = "Stark";
            age = 17;

        }


    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getAge() {
        return age;
    }
}



