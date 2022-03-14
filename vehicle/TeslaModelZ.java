package vehicle;

public class TeslaModelZ extends ElectricCar{
    public TeslaModelZ(double startingMileage, int modelNum){
        this.mileage = startingMileage;
        this.modelNum = modelNum;
    }
    
    public TeslaModelZ(int modelNum){
        this.mileage = 0;
        this.modelNum = modelNum;
    }

    public int getModelNum(){
        return modelNum;
    }

    public String getModel(){
        return model + modelNum; 
    }

    public String toString(){

    }
}
