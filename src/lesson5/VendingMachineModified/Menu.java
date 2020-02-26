package lesson5.VendingMachineModified;
import java.util.Scanner;

class Menu {

    /**
     * выводим стартовое меню и выбор напитков для пользователя
     */
   public void startMenu() {

        System.out.println("Добрый день!");
        System.out.println("Напитки на выбор: ");
        System.out.println("1: " + Drinks.COCACOLA + " / " + Drinks.COCACOLA.getAmount());
        System.out.println("2: " + Drinks.LIPTON + " / " + Drinks.LIPTON.getAmount());
        System.out.println("3: " + Drinks.J7 + " / " + Drinks.J7.getAmount());


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

 
    public void checkBalance(int choice, int amount) {

        if ((Drinks.COCACOLA.getSlot() == choice) && (Drinks.COCACOLA.getAmount() <= amount)) {
            System.out.println("Ваша " + Drinks.COCACOLA);
            System.out.println("Ваша сдача :" + (amount - Drinks.COCACOLA.getAmount()));
        }
        else if ((Drinks.LIPTON.getSlot() == choice) && Drinks.LIPTON.getAmount() <= amount) {
            System.out.println("Ваш " + Drinks.LIPTON);
            System.out.println("Ваша сдача :" + (amount - Drinks.LIPTON.getAmount()));
        }
        else if (Drinks.J7.getSlot() == choice && Drinks.J7.getAmount() <= amount) {
            System.out.println("Ваш " + Drinks.J7);
            System.out.println("Ваша сдача :" + (amount - Drinks.J7.getAmount()));
        }
        else{
            System.out.println("Недостаточно средств. Попробуйте снова.");
        }
    }
}