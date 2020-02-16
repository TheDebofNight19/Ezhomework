package lesson2;

 class Drinks {

    private int slot;
    private String drink;
    private double price;

    Drinks(int slot, String drink, double price){

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

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }
 }
