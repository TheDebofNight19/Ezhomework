package lesson1;
import java.util.Scanner;

/* Программа находит минимальное из двух чисел на основании введенных
 * с консоли данных */

public class LesserNumber {

    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.println("Пожалуйста, введите первое число : ");

        int a = num1.nextInt();

        System.out.println("Пожалуйста, введите второе число: ");

        int b = num2.nextInt();


        if (a < b) {
            System.out.println(a + " меньше чем " + b);
            }
        if (a == b) {
            System.out.println("Введенные вами числа равны");
            }
        if(a > b) {
            System.out.println(b + " меньше чем " + a);
            }
    }
}

