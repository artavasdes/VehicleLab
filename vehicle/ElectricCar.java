package vehicle;

public abstract class ElectricCar extends Car {
    private double milesOnMaxCharge;
    private double remaingingCharge;
    
    public ElectricCar(String make, String model, double startingMileage, double milesOnMaxCharge){
        super(make, model, startingMileage);
        if(milesOnMaxCharge < 0){
            throw new IllegalArgumentException();
        }
        
        this.remaingingCharge = milesOnMaxCharge;
        this.milesOnMaxCharge = milesOnMaxCharge;
        
    }

    public ElectricCar(String make, String model, double milesOnMaxCharge){
        this(make, model, 0, milesOnMaxCharge);
    }

    public void drive(double miles){
        if(miles < 0 || miles > getRemainingRange()){
            throw new IllegalArgumentException();
        }
        addMileage(miles);
        decreaseCharge(miles);
    }

    public double getRemainingRange(){
        return remaingingCharge;
    }

    public double getMaxRange(){
        return milesOnMaxCharge;
    }

    public void recharge(){
        remaingingCharge = milesOnMaxCharge;
    }

    protected void decreaseCharge(double miles){
        remaingingCharge -= miles;
    }
}
