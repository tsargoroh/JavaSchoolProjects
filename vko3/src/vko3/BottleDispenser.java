package vko3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BottleDispenser {
    private int bottles;
    private ArrayList<Bottle> bottle_list;
    private float money;
    private int i;
    private String choice;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public BottleDispenser() {
        bottles = 5;
        money = 0f;
        bottle_list = new ArrayList<Bottle>();
        bottle_list.add(new Bottle());
        bottle_list.add(new Bottle("Pepsi Max", "Pepsi", 0.5f, 1.5f, 2.2f));
        bottle_list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.5f, 0.5f, 2.0f));
        bottle_list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.5f, 1.5f, 2.5f));
        bottle_list.add(new Bottle("Fanta Zero", "Fanta", 0.5f, 0.5f, 1.95f));
    }
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    public void buyBottle() {
        listBottles();
        System.out.print("Your choice: ");
        try {
            choice = br.readLine();
        } catch (IOException ex) {}
        if (bottles != 0 && (money - bottle_list.get(Integer.parseInt(choice) - 1).getPrice() > 0)) {
            --bottles;
            money -= bottle_list.get(Integer.parseInt(choice) - 1).getPrice();
            System.out.println("KACHUNK! " + bottle_list.get(Integer.parseInt(choice) - 1).getName() + " came out of the dispenser!");
            bottle_list.remove(Integer.parseInt(choice) - 1);
        } else {
            System.out.println("Add money first!");
        }
    }
    public void returnMoney() {
        System.out.printf("Klink klink. Money came out! You got %.2f€ back\n", money);
        money = 0;
    }
    public void listBottles() {
        for (i = 0;i<bottles;i++) {
            System.out.println(i+1 + ". Name: " + bottle_list.get(i).getName());
            System.out.println("\tSize: " + bottle_list.get(i).getSize() + "\tPrice: " + bottle_list.get(i).getPrice());
        }
    }
}