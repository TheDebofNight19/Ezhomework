package lesson5.VendingMachineModified;

public enum Drinks {

    /**
     * можно для большей "красоты" добавить параметр name типа String для фиксации названия напитка,
     * но, в рамках задания в простом примере решил ограничиться названиями самих константт
     */

    COCACOLA(1, 45),
    LIPTON(2, 70),
    J7(3, 120);

    private int slot;
    private int amount;


    public int getSlot() {
        return slot;
    }


    public int getAmount() {
        return amount;
    }


    Drinks(int slot, int amount) {
        this.slot = slot;
        this.amount = amount;


    }

}
