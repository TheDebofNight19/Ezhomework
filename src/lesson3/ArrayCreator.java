package lesson3;
import java.util.Scanner;
import java.util.Random;

/*программа создает двумерный массив с диагоналями равными N (пользовательский ввод от 2 до 20), заполняет
* его рандомными числами и находит сумму главных диагоналей*/

public class ArrayCreator {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите число от 2 до 20");
        Scanner num = new Scanner(System.in);
        int l = num.nextInt();

        int[][] array = new int[l][l];
        Random random = new Random();

        int counter = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = random.nextInt(777);
                System.out.print(" " + array[i][j]);

                counter++;

                if (counter % l == 0) {
                    System.out.println();
                }
                if (i == j) {
                    sum1 += array[i][j];
                }
                if(array [i][j] == array[i][array.length - (i + 1)]) {
                    sum2 += array[i][j];
                }
            }

        }
        System.out.println("\n Сумма диагоналей равна " + (sum1 + sum2));
    }
}
