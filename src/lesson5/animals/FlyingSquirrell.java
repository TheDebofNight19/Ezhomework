package lesson5.animals;

public class FlyingSquirrell extends Animal implements Flyable, Runnable, Swimmable{

    @Override
    void getName() {
        System.out.print("Я - белка-летяга! ");
    }

    @Override
    public void fly(){
        System.out.print("Я летаю!");
    }

    @Override
    public void run(){
        System.out.printf(" И еще я могу бегать!");
    }

    @Override
    public void swim(){

        System.out.printf(" Да и плавать я тоже умею!");
    }

}
