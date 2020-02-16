package lesson1;

public class ProductTable {
    public static void main(String[] args) {

        int product;

        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                product = i * j;
                if(product < 10)
                {System.out.print(product + "  ");}
                else
                {System.out.print(product + " ");}
            }
            System.out.println();
        }
    }
}
