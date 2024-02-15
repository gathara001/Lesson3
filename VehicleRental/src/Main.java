class VehicleRentalService {
    void rentRide(String vehicleType, int customers){
        System.out.println("Rent a car for" + customers + "This customer" + vehicleType);
    }
    void rentRide(String vehicleType, double duration){
        System.out.println("Car will be rented for " + vehicleType + "This amount of time" +duration);
    }
    void rentRide(String vehicleType, boolean InsuranceOption){
        if(InsuranceOption) {
            System.out.println(" Insurance is included " + vehicleType + " " + InsuranceOption);
        }else{
            System.out.println("No insurance " + vehicleType);
        }
    }
}
class Main{
    public static void main(String[] args){
        VehicleRentalService rentalService = new VehicleRentalService();

        System.out.println("Rent this car");
        System.out.println("*********");
        rentalService.rentRide("Van",6);

        System.out.println("Place a duration");
        System.out.println("**********");
        rentalService.rentRide("Car",5.0);

        System.out.println("Are you insured");
        System.out.println("********");
        rentalService.rentRide("Motorbike",true);
    }
}