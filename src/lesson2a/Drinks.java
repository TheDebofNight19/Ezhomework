package lesson2a;

 class Drinks {

    private int slot;
    private String drink;
    private int price;

    Drinks(int slot, String drink, int price){

        this.slot = slot;
        this.drink = drink;
        this.price = price;
    }

     public int getSlot() {
         return slot;
     }

     public void setSlot(int slot) {
         this.slot = slot;
     }

     public String getDrink() {
         return drink;
     }

     public void setDrink(String drink) {
         this.drink = drink;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }
 }
