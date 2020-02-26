package lesson5.VendingMachineModified;

/**
 * Переписать проект с урока (вендинговыйавтомат) используя конструктор,
 * перечисления и взаимодействие с пользователем.
 */

public class VendingMachine {
    public static void main(String[] args){

        Menu menu =  new Menu();

        menu.startMenu();

        int choice  = menu.chooseDrink();
        while(choice < 1 || choice > 3){
            System.out.println("Вы ввели неверный номер напитка, попробуйте снова!");
            choice = menu.chooseDrink();
        }
        int amount = menu.insert();

        /**
         * инструкции на случай "нехватки денег"
         */
        while(amount == 0){
            System.out.print("Внесено 000.");
            System.out.println("Попробуйте еще раз.");
            amount = menu.insert();
        }

        menu.checkBalance(choice, amount);

    }
}
