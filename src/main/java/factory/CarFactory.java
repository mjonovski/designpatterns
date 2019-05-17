package factory;

public class CarFactory{
    public Car getCarType(int numberOfDoors, String model,Float
            capacity, Boolean land){
        Car car=null;
        if(capacity!=null){
            car=new Jeep();
            //implement setters
        }else{
            car=new Truck();
            //implement setters
        }
        return car;
    }

//    public static void main(String[] args){
//        Car c=null;
//        CarFactory carFactory=new CarFactory();
//        c = carFactory.getCarType(2,"BMW",null, true);
//    }
}