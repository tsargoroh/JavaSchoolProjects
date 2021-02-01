package vko3;

public class Bottle {
    private String name;
    private String manufacturer;
    private float total_energy;
    public Bottle() {
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3f;
    }
    public Bottle(String name, String manuf, double totE){
        this.name = name;
        manufacturer = manuf;
        total_energy = (float) totE;
    }
    public String getName() {
        return name;
    }
    //public String getManufacturer(){}
    //public double getEnergy(){}
}