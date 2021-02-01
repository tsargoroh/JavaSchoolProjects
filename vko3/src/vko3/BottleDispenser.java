package vko3;

import java.util.ArrayList;

public class BottleDispenser {
    private int bottles;
    private ArrayList<Bottle> bottle_list;
    private int money;
    private int i;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
        bottle_list = new ArrayList<Bottle>();
        for (i = 0;i<bottles;i++) {
            bottle_list.add(new Bottle());
        }
    }
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    public void buyBottle() {
        if (bottles != 0 && (money - bottle_list.get(0).getPrice() > 0)) {
            --bottles;
            money -= bottle_list.get(0).getPrice();
            System.out.println("KACHUNK! " + bottle_list.get(0).getName() + " came out of the dispenser!");
            bottle_list.remove(0);
        } else {
            System.out.println("Add money first!");
        }
    }
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
    public void listBottles() {
        for (i = 0;i<bottles;i++) {
            System.out.println(i+1 + ". Name: " + bottle_list.get(i).getName());
            System.out.println("\tSize: " + bottle_list.get(i).getSize() + "\tPrice: " + bottle_list.get(i).getPrice());
        }
    }
}