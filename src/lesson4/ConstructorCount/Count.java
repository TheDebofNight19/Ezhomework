package lesson4.ConstructorCount;

/**
 * создаем объекты класса Constructor, при запуске программы получаем на вывод количество объектов
 */

class Count {
    public static void main(String[] args){

        Constructor example = new Constructor();
        Constructor example1 = new Constructor();
        Constructor example2 = new Constructor();
        Constructor example3 = new Constructor();

        System.out.println(Constructor.constructorCount());
    }
}
