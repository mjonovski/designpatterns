package factory;

public class Car{

    private String model;
    private int numberOfDoors;
    public Car(){
    }
    public String getModel(){
        return this.model;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public void setModel(String model){ this.model = model; }
    public void setNumberOfDoors(int n){ this.numberOfDoors = n; }
}