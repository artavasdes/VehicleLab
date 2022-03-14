package vehicle;
import java.util.List;

abstract class Car {
    public String make;
    public String model;
    public double mileage;
    public double range;

    //Creates car
    public Car(String make, String model, double startingMileage) throws IllegalArgumentException{
        this.make = make;
        this.model = model;
        if(startingMileage < 0){
            throw new IllegalArgumentException("Starting Mileage cannot be negative!");
        }
        else{
            this.mileage = startingMileage;
        }
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
        this.mileage = 0;
    }

    public boolean canDrive(double miles) throws IllegalArgumentException{
        if(miles < 0){
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        if(getRemainingRange() >= miles){
            return true;
        }
        return false;
    }

    public abstract void drive(double miles);

    //Use folllowing code for drive(double miles) in gas and electric car
    /*
            if(miles < 0){
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        if(miles >= getRemainingRange()){
            throw new IllegalArgumentException("Not enough fuel!");
        }
        this.mileage += miles;
    */

    public String toString(){
        return String.format("%s %s (%5d mi) ", make, model, mileage);
    }

    public double getMileage(){
        return mileage;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public abstract double getRemainingRange();

    protected void addMileage(double miles) throws IllegalArgumentException{
        if(miles<0){
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        this.mileage += miles;
    }

    public int roadTrip(List<Double> milesEachDay) throws IllegalArgumentException{
        for(Double miles : milesEachDay){

        }
    }
}
