package lesson5.animals;

public class HoneyBadger extends Animal implements Runnable {

    @Override
    void getName() {
        System.out.print("Я - медоед! ");
    }

    @Override
    public void run(){

        System.out.println("Я очень быстро бегаю!");
    }
}