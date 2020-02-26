package lesson5.animals;

/**
 *пакет Animals содержит классы и интерфейсы из заданий 2 и 3 урока 5
 * в данном классе мы объявляем новые экземпляры классов разлчиных животных,
 * которые(классы) наследуются от абстрактного класса Animal
 * животным имплементируются некие навыки, объявленные в интерфейсах
 * Flyable, Swimmable и Rubnable
 */

public class AllEaters {

        public static void main(String[] args){

            HoneyBadger honeyBadger = new HoneyBadger();
            honeyBadger.getName();
            honeyBadger.run();

            Raccoon raccoon = new Raccoon();
            raccoon.getName();
            raccoon.run();
            raccoon.swim();

            FlyingSquirrell flyingSquirrell = new FlyingSquirrell();
            flyingSquirrell.getName();
            flyingSquirrell.fly();
            flyingSquirrell.run();
            flyingSquirrell.swim();

        }
    }


