package vko5;

import java.util.ArrayList;

public class Car{
    private ArrayList<Part> listOfParts = new ArrayList<Part>();
    
    public Car(){
        Body kori = new Body();
        listOfParts.add(kori);
        Chassis alusta = new Chassis();
        listOfParts.add(alusta);
        Engine moottori = new Engine();
        listOfParts.add(moottori);
        Wheel rengas1 = new Wheel();
        listOfParts.add(rengas1);
        Wheel rengas2 = new Wheel();
        listOfParts.add(rengas2);
        Wheel rengas3 = new Wheel();
        listOfParts.add(rengas3);
        Wheel rengas4 = new Wheel();
        listOfParts.add(rengas4);
    }
    public void print(){
        System.out.println("Car parts:");
        for (int i=0; i<listOfParts.size(); i++){
            if (listOfParts.get(i).getNumber() == 1)
                System.out.println("\t" + listOfParts.get(i).getClass().getSimpleName());
            else if (listOfParts.get(i).getNumber() > 1){
                System.out.println("\t" + listOfParts.get(i).getNumber() + " " + listOfParts.get(i).getClass().getSimpleName());
                listOfParts.get(i).setNumber(0);
            }
        }
    }
}
abstract class Part{
    public Part(String osa){
        System.out.println("Manufacturing: " + osa);
    }
    public abstract int getNumber();
    public abstract void setNumber(int x);
}
class Wheel extends Part{
    private static int lkm = 0;
    public Wheel(){
        super("Wheel");
        lkm++;
    }
    @Override
    public int getNumber(){
        return lkm;
    }
    @Override
    public void setNumber(int x){
        lkm = x;
    }
}
class Body extends Part{
    private static int lkm = 0;
    public Body(){
        super("Body");
        lkm++;
    }
    @Override
    public int getNumber(){
        return lkm;
    }
    @Override
    public void setNumber(int x){
        lkm = x;
    }
}
class Chassis extends Part{
    private static int lkm = 0;
    public Chassis(){
        super("Chassis");
        lkm++;
    }
    @Override
    public int getNumber(){
        return lkm;
    }
    @Override
    public void setNumber(int x){
        lkm = x;
    }
}
class Engine extends Part{
    private static int lkm = 0;
    public Engine(){
        super("Engine");
        lkm++;
    }
    @Override
    public int getNumber(){
        return lkm;
    }
    @Override
    public void setNumber(int x){
        lkm = x;
    }
}