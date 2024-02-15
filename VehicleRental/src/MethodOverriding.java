import java.time.Duration;

class Vehicle{
    void startEngine(){
        System.out.println("The vehicle will start");
    }
}
class CarDuration extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("The Duration will commence ");
    }
}
class Type extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("The car has insurance");
    }
}
class mainVehicle{
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle();
        System.out.println("Does the vehicle start ?");
        vehicle.startEngine();
        System.out.println("********");

        System.out.println("Has the duration began");
        CarDuration duration=new CarDuration();
        vehicle.startEngine();
        System.out.println("********");

        System.out.println("Does the car have insurance? ");
        Type type=new Type;
        vehicle.startEngine();
        System.out.println("********");
    }
}