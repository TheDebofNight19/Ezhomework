package lesson2;

public class VendingMachine {
    public static void main(String[] args){

        Menu menu =  new Menu();

        menu.startMenu();

        int choice  = menu.chooseDrink();
        while(choice < 1 || choice > 3){
            System.out.println("Вы ввели неверный номер напитка, попробуйте снова!");
            choice = menu.chooseDrink();
        }
        double amount =  menu.insert();

        menu.checkBalance(choice, amount);

    }
}
