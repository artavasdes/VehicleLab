package vehicle;
//zsofia
public abstract class GasPoweredCar {

	private String make;
	private String model;
	private double currentMiles;
	private double startingMileage;
	private double mpg;
	private double currentFuel;
	private double fuelCapacityGallons;

	public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons){
		if(mpg<=0||fuelCapacityGallons<=0)
			throw new IllegalArgumentException();
		this.make=make;
		this.model=model;
		this.startingMileage=this.currentMiles=startingMileage;
		this.mpg=mpg;
		this.currentFuel=this.fuelCapacityGallons=fuelCapacityGallons;		

	}

	public GasPoweredCar (String make, String model, double mpg, double fuelCapacityGallons){
		if(mpg<=0||fuelCapacityGallons<=0)
			throw new IllegalArgumentException();
			this.make=make;
			this.model=model;
			this.startingMileage=0;
			this.mpg=mpg;
			this.fuelCapacityGallons=fuelCapacityGallons;		
	}
	
	public void drive(double miles){
		if(miles<0||currentFuel/mpg<miles)
			throw new IllegalArgumentException();
		currentFuel-=(miles/mpg);
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
		
	}

	protected void decreaseFuelLevel(double miles){
		currentFuel-=(miles/mpg);	
	}


}
