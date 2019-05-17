package factory;

public class Jeep extends Car{
    private boolean land;
    public Jeep(){
    }

    public void setLand(boolean land){
        this.land=land;
    }
    public boolean getLand(){
        return this.land;
    }
}