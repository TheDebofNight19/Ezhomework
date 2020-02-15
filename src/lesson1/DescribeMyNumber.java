package lesson1;
import java.util.Scanner;

/*программа пописывает введенное с консоли число - отрицательное оно или нет, четно или нечетное.
* На основании заданных условий был выбран тип long и добавлена проверка чила на предмет является ли оно
* простым/составным */

public class DescribeMyNumber {
    public static void  main(String[] args){

        System.out.println("Это программа описывает введенное вами число.");
        System.out.println("Вы можете вводить целые отрицательные или положительные числа.");
        System.out.print("Введите ваше число: ");

        Scanner num = new Scanner(System.in);

        long a = num.nextLong();
        boolean state = false;
        long result;


        for(long i = 2; i < a; i++){
            result = a % i;
            if(result == 0){
                System.out.print("Вы ввели составное ");
                state = true;
                break;
                }
            }

        if(!state){
            System.out.print("Вы ввели простое ");
        }

        if(a % 2 == 0 && a != 0){
            System.out.print("четное ");
        }
        if(a % 2 != 0){
            System.out.print("нечетное ");
        }
        if(a < 0) {
            System.out.print("отрицательное число.");
        }
        if(a > 0){
                System.out.print("положительное число.");
        }
        if(a == 0){
            System.out.print("Вы ввели ноль.");
        }
    }
}
