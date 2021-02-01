package vko3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
    public static void main(String[] args){
        String choise = null;
        BottleDispenser bd = new BottleDispenser();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("\n*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
            System.out.print("Your choice: ");
            try {
                choise = br.readLine();
            } catch (IOException ex) {}
            
            if (choise.equals("1"))
                bd.addMoney();
            else if (choise.equals("2"))
                bd.buyBottle();
            else if (choise.equals("3"))
                bd.returnMoney();
            else if (choise.equals("4"))
                bd.listBottles();
            else if (choise.equals("0"))
                break;
            else
                System.out.println("Error");
        }
    }
}