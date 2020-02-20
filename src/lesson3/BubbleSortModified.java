package lesson3;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortModified {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите число от 2 до 20");
        Scanner num = new Scanner(System.in);
        int l = num.nextInt();

        int[] array = new int[l];
        int[] arrayNew = new int[l];
        Random random = new Random();
        int temp;
        int counter = 0;

        System.out.println("Массив 1: ");

        for (int i = 0; i < array.length; i++) {
                array[i] = arrayNew[i] = random.nextInt(777);
                System.out.print(array[i] + " ");
        }


        System.out.println();
        System.out.println("Сортируем массив: ");

        //версия стандартная

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    counter++;
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Количество перестановок: " + counter);

        int tempNew;
        int counterNew = 0;


        System.out.println("Массив2:\n ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + " ");
        }

        System.out.println("Сортируем массив(ver2): ");

        //улучшенная версия



        for (int i = 0; i < arrayNew.length; i++) {
            for (int j = i; j < arrayNew.length; j++) {

                if (arrayNew[j] < arrayNew[0]){ // проверяем самый левый элемент массива
                    temp = arrayNew[0];
                    arrayNew[0] = arrayNew[j];
                    arrayNew[j] = temp;
                }
                if (arrayNew[j] > array[arrayNew.length - 1]){ // проверяем самый правый элемент массива
                    temp = array[arrayNew.length - -1];
                    arrayNew[arrayNew.length - 1] = arrayNew[j];
                    arrayNew[j] = temp;
                }
                if (arrayNew[i] > arrayNew[j]) {
                    tempNew = arrayNew[i];
                    arrayNew[i] = arrayNew[j];
                    arrayNew[j] = tempNew;
                    counterNew++;
                }
            }
            System.out.print(arrayNew[i] + " ");
        }
        System.out.println("\n" + "Количество перестановок: " + counterNew);
    }
}