package lesson6.Basket;

import java.util.ArrayList;
import java.util.List;

public class ShopBasket implements Basket {

    private ArrayList<Item> itemList =  new ArrayList<>();
    private ArrayList<String> allItems = new ArrayList<>();
    private int itemQuantity;


    @Override
    public void addProduct(String product, int quantity) {
        Item item = new Item();
        item.setItemName(product);
        item.setItemQuantity(quantity);
        itemList.add(item);
    }

    @Override
    public void removeProduct(String product) {
        for(Item item:itemList){
            if(item.getItemName().equals(product)){
                itemList.remove(item);
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Item item : itemList) {
            if (item.getItemName().equals(product)) {
                int i = item.getItemQuantity();
                i += quantity;
                item.setItemQuantity(i);
            }
        }
    }

    @Override
    public void clear() {

        itemList.removeAll(itemList);
    }

    @Override
    public List<String> getProducts() {

        for (Item item : itemList) {
            String product = item.getItemName();
            allItems.add(product);
        }
        return allItems;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Item item : itemList) {
            if (item.getItemName().equals(product)) {
                itemQuantity = item.getItemQuantity();
            }
        }
        return itemQuantity;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}
