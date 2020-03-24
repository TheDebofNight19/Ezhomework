package lesson6.Basket;

public class Main {

    public static void main(String[] args) {

        ShopBasket shopBasket = new ShopBasket();

        System.out.println("Демонстрация методов из класса ShopBasket");

        /**
         * добавляем товары и количество в корзину
         */

        shopBasket.addProduct("Sony", 3);
        shopBasket.addProduct("NES", 1);
        shopBasket.addProduct("Sega", 0);

        System.out.println("Список товаров и их количество:");

        for(Item item : shopBasket.getItemList()){
            System.out.println(item.getItemName() + "  " + item.getItemQuantity());
        }

        System.out.println("---------------------------------------");

        System.out.println("Увеличиваем количество Sega , проверяем что количество изменилось");
        shopBasket.updateProductQuantity("Sega", 76);
        System.out.println(shopBasket.getProductQuantity("Sega"));

        System.out.println("Удаляем из списка NES");
        shopBasket.removeProduct("NES");
        System.out.println("Выводим список оставшихся продуктов");
        System.out.println(shopBasket.getProducts());
        System.out.println("---------------------------------------");
        System.out.println("Перепроверяем товары/количество:");
        for(Item item : shopBasket.getItemList()){
            System.out.println(item.getItemName() + "  " + item.getItemQuantity());
        }

        /**
         * Удаляем все товары из корзины
         */
        shopBasket.clear();

        System.out.println("Теперь убедимся, что мы очистили корзину:");

        for(Item item : shopBasket.getItemList()){
            System.out.println(item.getItemName() + " X " + item.getItemQuantity());
        }
        System.out.println(shopBasket.getItemList());

    }
}
