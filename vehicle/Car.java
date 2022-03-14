package vehicle;

abstract class Car {
    public String make;
    public String model;
    public double startingMileage;

    //Creates car
    public Car(String make, String model, double startingMileage) throws IllegalArgumentException{
        this.make = make;
        this.model = model;
        if(startingMileage < 0){
            throw new IllegalArgumentException("Starting Mileage cannot be negative!");
        }
        else{
            this.startingMileage = startingMileage;
        }
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
        this.startingMileage = 0;
    }
}
