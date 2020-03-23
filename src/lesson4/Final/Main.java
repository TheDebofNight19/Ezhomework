package lesson4.Final;

public class Main{

    public static void main(String[] args) {

        IceAndFire hero = new IceAndFire();

        /**
         * закомментированный ниже код  не скомпилируется Idea,
         * т.к. мы пытаемся изменить значения самих переменных типа final
         */

//        hero.age += 5;
//        hero.name = "Jaime";
//        hero.house =  "Lannister";

        /**
         * однако, при необходимости мы можем получить значение переменных final через
         * геттер и присвоить их новым переменным, и далее изменить
         */

        int heroAge = hero.getAge();
        String heroName = hero.getName();
        String heroHouse = hero.getHouse();
        System.out.println(heroAge + " " + heroHouse + " " + heroName);
        heroAge += 5;
        heroName = "Jaime";
        heroHouse = "Lannister";
        System.out.println(heroAge + " " + heroHouse + " " + heroName);


       }

}
