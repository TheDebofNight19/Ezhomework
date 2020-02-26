package lesson4.ConstructorCount;

/**
 * Создаем класс, в конструкторе которого происходит инкремент статичной переменной
 * Статик метод возвращает ее значение
 */

public class Constructor {

    private static int a = 0;

    public static int constructorCount(){
        return a;}

    public Constructor(){

        a++;
    }
}