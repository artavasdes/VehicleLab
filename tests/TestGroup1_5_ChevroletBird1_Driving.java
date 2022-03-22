package tests;
import vehicle.ChevroletBird;
import bcatest.BCATestScenario;
import java.util.List;
import java.util.Arrays;

public class TestGroup1_5_ChevroletBird1_Driving extends BCATestScenario {
	public int runTest() {
		assertThrows(IllegalArgumentException.class, () -> {new ChevroletBird(-100);}, "Starting mileage cannot be negative.");
	
		ChevroletBird c1 = new ChevroletBird();
	
		assertEquals(c1.getMileage(), 0, .1, "Starting mileage should be 0");
	
		assertEquals(c1.getMaxRange(), 250, .1, "Miles on max charge should be 250");
	
		//assertEquals(c1.getRemainingRange(), 0, .1, "Fuel level should be 0");
	
	
		c1.recharge();
		assertThrows(IllegalArgumentException.class, () -> {c1.drive(-10);}, "Driving mileage cannot be negative.");
	
		c1.drive(200);
	
		assertEquals(c1.getMileage(), 200.0, .1, "Mileage should be 200");
	
		assertEquals(c1.getRemainingRange(), 50.0, .1, "Remaingin range should be 50");
	
		c1.recharge();
		assertEquals(c1.getRemainingRange(), 250.0, .1, "Remianing range should be 250");
	
		assertEquals(c1.toString(), "Chevrolet Bird (200 mi)", "toString does not match");
		
		List<Double> list=Arrays.asList(50.0,50.0,50.0,-100.0);
		assertThrows(IllegalArgumentException.class, () -> {c1.roadTrip(list);}, "Mileage in any position of the list cannot be negative");
		
		List<Double> list2=Arrays.asList(50.0,50.0,50.0,100.0);
		c1.roadTrip(list2);
		assertEquals(c1.getMileage(), 450.0, .1, "Mileage should be 450");
		
		assertEquals(c1.getRemainingRange(), 0.0, .1, "Remaining range should be 0");
	
		c1.recharge();
		assertEquals(c1.getRemainingRange(), 250.0, .1, "remaining range should now be 250");
		
		assertThrows(IllegalArgumentException.class,()->{c1.drive(300);},"should throw IllegalArgumentExcpetion, out of range");
	
	
		return getFailedCount();
	    }
	
}
