package lesson4.Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        System.out.println("Введите первое число.");
        System.out.println("Если вы желаете вычислить процент, " +
                "то введенное первым значение будет числом, от которого вы ищите процент:");

        Scanner num1 = new Scanner(System.in);
        double a =  num1.nextDouble();

        System.out.println("Введите второе число.");
        System.out.println("Если вы желаете вычислить процент от первого числа, " +
                "то укажите величину процентной доли здесь: ");

        Scanner num2 = new Scanner(System.in);
        double b =  num2.nextDouble();

        System.out.println("Выберите действие:| + | - | * | / | % |");

        Scanner s = new Scanner(System.in);
        String operator = s.next();

        if(operator.contentEquals("+")){
        System.out.println(CalculateMethods.add(a,b));
        }

        if(operator.contentEquals("-")){
            System.out.println(CalculateMethods.subtract(a,b));
        }

        if(operator.contentEquals("*")){
            System.out.println(CalculateMethods.multiply(a,b));
        }

        if(operator.contentEquals("/")){
            System.out.println(CalculateMethods.divide(a,b));
        }
        if(operator.contentEquals("%")){
            System.out.println(CalculateMethods.findPercent(a,b));
        }
    }
}

