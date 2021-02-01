package vko3;

public class Mainclass {
    public static void main(String[] args){
        BottleDispenser bd = new BottleDispenser();
        bd.addMoney();
        bd.buyBottle();
        bd.buyBottle();
        bd.addMoney();
        bd.addMoney();
        bd.buyBottle();
        bd.returnMoney();
    }
}