package vehicle;

public class HondaAccordian extends GasPoweredCar {
	private int modelYear;

	public HondaAccordian(double startingMileage, int modelYear){
		super("Honda", "Accordion", startingMileage, 33.2, 14.5);
		this.modelYear=modelYear;
		
	}

	public HondaAccordian(int year){
		super("Honda","Accordion",0,33.2,14.5);
		this.modelYear=year;
	}
	public String toString(){
		return String.format("%d Honda Accordion (%d mi)",modelYear,((Car)this).getMileage());
	}
}