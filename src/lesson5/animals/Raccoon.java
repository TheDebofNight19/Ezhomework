package lesson5.animals;

public class Raccoon extends Animal implements Runnable, Swimmable {

    @Override
    void getName() {
        System.out.print("Я - енот!");
    }


    @Override
    public void run() {
        System.out.print(" Я тоже могу бегать!");
    }

    @Override
    public void swim() {
        System.out.println(" Плаваю, если захочу!");
    }
}