package lesson2;
import java.util.Scanner;

//заполняем меню напитками с указанием кнопки выбора, названия и цены
    class Menu {

    Drinks soda = new Drinks(1, "Coca Cola", 45);
    Drinks juice = new Drinks(2, "J7", 120);
    Drinks iceTea = new Drinks(3, "Lipton", 70);

//вывод меню напитков пользователю
    void startMenu() {

        System.out.println("Добрый день!");
        System.out.println("Напитки на выбор: ");
        System.out.println(soda.getSlot() + " / " + soda.getDrink() + " / " + soda.getPrice() + ".");
        System.out.println(juice.getSlot() + " / " + juice.getDrink() + " / " + juice.getPrice() + ".");
        System.out.println(iceTea.getSlot() + " / " + iceTea.getDrink() + " / " + iceTea.getPrice() + ".");

        System.out.print("Выберите ваш напиток: ");
    }
//считываем и сохраняем пользовательский выбор
    int chooseDrink() {
        Scanner option = new Scanner(System.in);
        int slot = option.nextInt();
        return slot;
    }
//"принимаем деньги" от пользователя

    int insert() {
        System.out.println("Внесите наличные средства. ");
        Scanner money = new Scanner(System.in);
        return money.nextInt();
    }
//выдаем напиток в соответствии с выбранной позицией, считаем сдачу, если есть
    void checkBalance(int slot, int amount) {

        if (soda.getSlot() == slot && soda.getPrice() <= amount) {
            System.out.println("Ваша " + soda.getDrink());
            System.out.println("Ваша сдача :" + (amount - soda.getPrice()));
        }
        else if (juice.getSlot() == slot && juice.getPrice() <= amount) {
            System.out.println("Ваш " + juice.getDrink());
            System.out.println("Ваша сдача :" + (amount - juice.getPrice()));
        }
        else if (iceTea.getSlot() == slot && iceTea.getPrice() <= amount) {
            System.out.println("Ваш " + iceTea.getDrink());
            System.out.println("Ваша сдача :" + (amount - iceTea.getPrice()));
        }
        else{
            System.out.println("Недостаточно средств. Попробуйте снова.");
        }
    }
}