package vehicle;
//zsofia
public abstract class GasPoweredCar extends Car {

	private double currentMiles;
	private double mpg;
	private double currentFuel;
	private double fuelCapacityGallons;

	public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons){
		super(make, model, startingMileage);
		if(mpg<=0||fuelCapacityGallons<=0)
			throw new IllegalArgumentException();
		this.mpg=mpg;
		this.currentFuel=fuelCapacityGallons;		
	}

	public GasPoweredCar (String make, String model, double mpg, double fuelCapacityGallons){
		super(make, model, 0);
		if(mpg<=0||fuelCapacityGallons<=0)
			throw new IllegalArgumentException();
		this.mpg=mpg;
		this.currentFuel=fuelCapacityGallons;		
	}
	
	public void drive(double miles){
		if(miles<0||currentFuel/mpg<miles)
			throw new IllegalArgumentException();
		//currentFuel-=(miles/mpg);
		decreaseFuelLevel(miles);
		currentMiles+=miles;
	}

	public double getMPG(){
		return mpg;
	}

	public double getFuelLevel(){
		return currentFuel;
	}

	public double getFuelCapacity(){
		return fuelCapacityGallons;
	}

	public void refillTank(){
		currentFuel=fuelCapacityGallons;
	}
	
	public double getRemainingRange(){
		return (currentFuel/mpg);
	}

	public void refillTank(double gallons){
		if(gallons<0||(currentFuel+gallons>fuelCapacityGallons))
			throw new IllegalArgumentException();
		currentFuel+=gallons;
		
	}

	protected void decreaseFuelLevel(double miles){
		currentFuel-=(miles/mpg);	
	}


}
