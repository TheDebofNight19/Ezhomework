package lesson4;
import java.util.Scanner;

public class StringCensor {
    public static void main(String... args){

        System.out.println("Введите ваш текст ниже: ");

        Scanner s = new Scanner(System.in);
        String text = s.nextLine();


        String censoredText = text.replaceAll("бяк.", "вырезано цензурой");


        System.out.println("Ваш техт: \n" + text);
        System.out.println("Текст с цензурой: \n" + censoredText);


    }
}
