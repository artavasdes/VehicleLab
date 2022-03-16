package vehicle;

public class TeslaModelZ extends ElectricCar implements SelfDriving{
    int modelNum;
    public TeslaModelZ(double startingMileage, int modelNum){
        super("Tesla", "Z", startingMileage, 340);
        this.modelNum = modelNum;
    }
    
    public TeslaModelZ(int modelNum){
        this(0, modelNum);
    }

    public int getModelNum(){
        return modelNum;
    }

    public String getModel(){
        return "Z" + modelNum; 
    }

    public void driveAutonomously(double miles){
        if(miles < 0){
            throw new IllegalArgumentException();
        }

        if(miles > getRemainingRange()){
            super.drive(miles - getRemainingRange());
        }
        
        super.drive(miles);
        super.decreaseCharge(miles);

    }
}
