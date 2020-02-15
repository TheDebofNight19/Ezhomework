package lesson1;
import java.util.Scanner;

/*Эта программа выводит арифметическую или геометрическую прогрессию для числа N
* В программе не учтены возможные переполнения.*/

public class Progression {
    public static void main(String[] args) {

        System.out.println("Эта программа выведет арифметическую(1) или геометрическую прогрессию(2).");

        System.out.println("Введите первый элемент прогрессии: ");
        Scanner num1 = new Scanner(System.in);
        long base = num1.nextLong();

        System.out.println("Введите количество элементов прогрессии: ");
        Scanner num2 = new Scanner(System.in);
        long n1 = num2.nextLong();

        System.out.println("Введите шаг: ");
        Scanner num3 = new Scanner(System.in);
        long step = num3.nextLong();

        System.out.print("Выберите тип прогрессии: ");
        Scanner num = new Scanner(System.in);
        short option = num.nextShort();

        if(option ==  1){

        System.out.print("Ваша прогрессия: " + base + " " );

            for(int i = 1; i < n1; i++){
                base += step;
                System.out.print(base + " ");
                if(i % 25 == 0){
                    System.out.println("\n");
                }
            }
        }
        if(option ==  2){

            System.out.print("Ваша прогрессия: " + base + " " );

            for(int i = 1; i < n1; i++){
                base *= step;
                System.out.print(base + " ");
                if(i % 25 == 0){
                    System.out.println("\n");
                }
            }
        }
    }
}