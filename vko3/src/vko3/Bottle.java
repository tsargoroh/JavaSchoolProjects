package vko3;

public class Bottle {
    private String name;
    private String manufacturer;
    private float total_energy;
    private float size;
    private float price;
    public Bottle() {
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3f;
        size = 0.5f;
        price = 1.80f;
    }
    public Bottle(String name, String manuf, double totE, float size, float price){
        this.name = name;
        manufacturer = manuf;
        total_energy = (float) totE;
        this.size = size;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    //public String getManufacturer(){}
    //public double getEnergy(){}
}