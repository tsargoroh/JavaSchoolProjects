package vko3;

public class BottleDispenser {
    private int bottles;
    private int money;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
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
        System.out.println("Klink klink!! All money gone!");
    }
}