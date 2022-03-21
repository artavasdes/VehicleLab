package vehicle;


public class ChevroletBird extends ElectricCar implements Flying {

	private boolean wingsExtended;

	public ChevroletBird(double startingMileage){
		super("Chevrolet","Bird",startingMileage,250);
		wingsExtended=false;
	}
	public ChevroletBird(){
		super("Chevrolet","Bird",0,250);
	}
	public boolean checkWingsExtended(){
		return wingsExtended;
	}
	public void drive(double miles){
		wingsExtended=false;
		if(miles < 0 || miles > getRemainingRange()){
			throw new IllegalArgumentException();
		}
		addMileage(miles);
		decreaseCharge(miles);
		
	}
	@Override
	public boolean canFly(double miles) {
		if(miles<0)
			throw new IllegalArgumentException();
		return true;
	}

	@Override
	public void fly(double miles) {
		if(miles < 0 || miles > getRemainingRange()){
			throw new IllegalArgumentException();
		}
		wingsExtended=true;
		decreaseCharge(miles);	
	}
    
}
