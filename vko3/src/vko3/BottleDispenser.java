package vko3;

public class BottleDispenser {
    private int bottles;
    private Bottle[] bottle_array;
    private int money;
    
    public BottleDispenser() {
        bottles = 50;
        money = 0;
        bottle_array = new Bottle[bottles];
        for (int i = 0;i<bottles;i++) {
            bottle_array[i] = new Bottle();
        }
    }
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    public void buyBottle() {
        if (bottles != 0 && money != 0) {
            --bottles;
            --money;
            System.out.println("KACHUNK! A bottle came out of the dispenser!");
        }else if (money == 0) {
            System.out.println("Add money first!");
        }
    }
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}