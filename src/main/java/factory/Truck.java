package factory;

public class Truck extends Car{
    private float capacity;
    public Truck(){
    }
    public void setCapacity(float capacity){
        this.capacity=capacity;
    }
    public float getCapacity(){
        return this.capacity;
    }
}