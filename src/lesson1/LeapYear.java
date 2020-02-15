package lesson1;

/*данная программа определяет является ли год високосным при условии, что каждый 4-й год - високосный, и
* каждый 150-й год  високосный*/

import java.util.Scanner;

public class LeapYear {

    public static void  main(String[] args) {

        System.out.println("Это программа определяет является ли год високосным");
        System.out.print("Введите год: ");

        Scanner num = new Scanner(System.in);

        long year = num.nextLong();

        if ((year % 150 == 0 || year % 4 == 0) && year != 0)
            System.out.print("Это високосный год!");

        else{
            System.out.print("Это не високосный год!");
        }

    }
}