package lesson5.human;

public class Jogger extends Human{

    @Override
    public void sprint() {
        System.out.println("Плохо ускоряется");

    }

    @Override
    public void slowPace() {
        System.out.println("Бежит очень медленно");
    }

    @Override
    public void dive(){
        System.out.println("Ныряет хуже морского котика");
    }

    public void brass(){
        System.out.println("Не умеет плавать брассом");
    }
}
