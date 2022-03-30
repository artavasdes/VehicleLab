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
        if(miles*2>=getRemainingRange()){
            throw new IllegalArgumentException("Not enough fuel!");
        }
        super.drive(miles);
        super.decreaseFuelLevel(miles);

        // if(miles < 0 || miles*2 > getRemainingRange()){
        //     throw new IllegalArgumentException();
        // }

        // if(miles * 2> getRemainingRange()){
        //     super.addMileage(getRemainingRange());
        //     super.drive(getRemainingRange());
        // }
        // else if(miles * 2 < getRemainingRange()){
        //     super.addMileage(miles);
        //     super.drive(miles);
        // }
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
