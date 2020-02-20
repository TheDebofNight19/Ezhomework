package lesson3;
import java.util.Scanner;
import static lesson3.Sequence.sequenceFind;

/*данная программа выводит последовательность Фиббоначчи до указанного пользователем N
* посредством рекурсии. Будем придерживаться последовательности, начинающейся с 0, 1, 1, 2, 3...*/

public class Fibonacci {

    public static void main(String[] args){

        System.out.print("Пожалуйста, введите порядковый элемент последовательности: ");

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        int a =  0;
        int b =  1;

        sequenceFind(a, b, (n - 2));

    }
}

