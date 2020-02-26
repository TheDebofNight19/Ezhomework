package lesson2a;
import java.util.Scanner;

/**
 * объявляем новые объекты класса Drinks, присваиваем им слоты, название и цену
 */
    class Menu {

    private Drinks soda = new Drinks(1, "Coca Cola", 45);
    private Drinks juice = new Drinks(2, "J7", 120);
    private Drinks iceTea = new Drinks(3, "Lipton", 70);

    /**
     * выводим стартовое меню и выбор напитков для пользователя
     */
   public void startMenu() {

        System.out.println("Добрый день!");
        System.out.println("Напитки на выбор: ");
        System.out.println(soda.getSlot() + " / " + soda.getDrink() + " / " + soda.getPrice() + ".");
        System.out.println(juice.getSlot() + " / " + juice.getDrink() + " / " + juice.getPrice() + ".");
        System.out.println(iceTea.getSlot() + " / " + iceTea.getDrink() + " / " + iceTea.getPrice() + ".");

        System.out.print("Выберите ваш напиток: ");
    }

    /**
     * считываем и сохраняем пользовательский выбор
     */

    public int chooseDrink() {
        Scanner option = new Scanner(System.in);
        int slot = option.nextInt();
        return slot;
    }

    /**
     * принимаем деньги от пользователя(ввод с консоли)
     * @return интовое значение, считанное с консоли
     */

   public int insert() {
        System.out.println("Внесите наличные средства. ");
        Scanner money = new Scanner(System.in);
        return money.nextInt();
    }

    /**
     *
     * @param slot
     * @param amount
     */
    public void checkBalance(int slot, int amount) {

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