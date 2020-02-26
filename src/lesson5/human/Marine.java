package lesson5.human;

public class Marine extends Human {


    @Override
    public void sprint() {
        System.out.println("Быстро бежит");
    }

    @Override
    public void slowPace() {
        System.out.println("Не любит бегать медленно");
    }

    @Override
    public void dive() {
        System.out.println("Глубоко ныряет");
    }

    @Override
    public void brass() {
        System.out.println("Плывет брассом");
    }


}
