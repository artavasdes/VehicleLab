package vehicle;

public class FordFrivolous extends GasPoweredCar implements SelfDriving, Flying{
    public FordFrivolous(double startingMileage){
       super("Ford", "Frivolous", startingMileage, 23.6, 20.0);
    }

    public FordFrivolous(){
        super("Ford", "Frivolous", 23.6, 20.0);
    }

    public void driveAutonomously(double miles){
        if(miles < 0){
            throw new IllegalArgumentException();
        }

        if(miles * 2 > getRemainingRange()){
            super.addMileage(getRemainingRange()/2);
            super.decreaseFuelLevel(getRemainingRange());
        }   
        else if(miles * 2 < getRemainingRange()){
            super.decreaseFuelLevel(miles*2);
            super.addMileage(miles);
        }
    }

    public boolean canFly(double miles){
        if(miles < 0){
            throw new IllegalArgumentException("mileage cannot be negative");
        }
        if(miles*3>getRemainingRange()){
            return false;
        }
        return true;
    }

    public void fly(double miles){
        if(miles < 0){
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        if(miles>getRemainingRange()){
            throw new IllegalArgumentException("Miles exceeds remaining range!");
        }
        super.decreaseFuelLevel(miles);
        super.decreaseFuelLevel(miles);
        super.decreaseFuelLevel(miles);
    }
    
}
