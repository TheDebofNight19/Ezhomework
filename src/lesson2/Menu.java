package lesson2;
import java.util.Scanner;

public class Menu {

    Drinks soda = new Drinks(1, "Coca Cola", 0.85);
    Drinks juice = new Drinks(2, "J7", 1.91);
    Drinks iceTea = new Drinks(3, "Lipton", 0.95);

    public void startMenu() {

        System.out.println("Добрый день!");
        System.out.println("Напитки на выбор: ");
        System.out.println(soda.getSlot() + " / " + soda.getDrink() + " / " + soda.getPrice() + ".");
        System.out.println(juice.getSlot() + " / " + juice.getDrink() + " / " + juice.getPrice() + ".");
        System.out.println(iceTea.getSlot() + " / " + iceTea.getDrink() + " / " + iceTea.getPrice() + ".");

        System.out.print("Выберите ваш напиток: ");
    }

    public int chooseDrink() {
        Scanner option = new Scanner(System.in);
        int slot = option.nextInt();
        return slot;
    }

    public double insert() {
        System.out.println("Внесено 00,00.");
        System.out.println("Внесите наличные средства. ");
        Scanner money = new Scanner(System.in);
        double amount = money.nextDouble();
        return amount;
    }

    public void checkBalance(int slot, double amount) {

        if (soda.getSlot() == slot && soda.getPrice() <= amount) {
            System.out.println("Ваша " + soda.getDrink());
            System.out.println("Ваша сдача :" + (amount - soda.getPrice()));
        }
        if (juice.getSlot() == slot && juice.getPrice() <= amount) {
            System.out.println("Ваш " + juice.getDrink());
            System.out.println("Ваша сдача :" + (amount - juice.getPrice()));
        }
        if (iceTea.getSlot() == slot && iceTea.getPrice() <= amount) {
            System.out.println("Ваш " + iceTea.getDrink());
            System.out.println("Ваша сдача :" + (amount - iceTea.getPrice()));
        }
        else {
            System.out.println("Недостаточно средств!");
            System.out.println("Попробуйте снова!");
        }

    }
}