package vehicle;

public class TeslaModelZ extends ElectricCar{
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
}
