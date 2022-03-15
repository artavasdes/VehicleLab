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
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        super.drive(miles);
        super.decreaseFuelLevel(miles);
    }

    public boolean canFly(double miles){
        if(miles < 0){
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        return true;
    }

    public void fly(double miles){
        if(miles < 0){
            throw new IllegalArgumentException("Miles cannot be negative!");
        }
        if(getRemainingRange()<=0){
            throw new IllegalArgumentException("Miles exceeds remaining range!");
        }
        super.drive(miles);
        super.decreaseFuelLevel(miles);
        super.decreaseFuelLevel(miles);
    }
    
}
