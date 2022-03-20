package tests;

import vehicle.FordFrivolous;
import bcatest.BCATestScenario;

public class TestFordFrivolous_Driving extends BCATestScenario {


    public int runTest() {
        assertThrows(IllegalArgumentException.class, () -> {new FordFrivolous(-100);}, "Starting mileage cannot be negative.");

        FordFrivolous f1 = new FordFrivolous();

        assertEquals(f1.getMileage(), 0, .1, "Starting mileage should be 0");

        assertEquals(f1.getFuelCapacity(), 20, .1, "Fuel capacity should be 20");

        assertEquals(f1.getFuelLevel(), 0, .1, "Fuel level should be 0");

        assertEquals(f1.getMPG(), 23.6, .1, "MPG should be 23.6");

        f1.refillTank(15);
        assertThrows(IllegalArgumentException.class, () -> {f1.refillTank(-15);}, "Value to refill tank by cannot be negative");

        assertThrows(IllegalArgumentException.class, () -> {f1.drive(-10);}, "Driving mileage cannot be negative.");

        f1.drive(118);

        assertEquals(f1.getMileage(), 118, .1, "Mileage should be 118");

        assertEquals(f1.getFuelLevel(), 10, .1, "Fuel level should be 10");

        f1.refillTank();
        assertEquals(f1.getFuelLevel(), 20, .1, "Fuel level should be 20");

        assertThrows(IllegalArgumentException.class, () -> {f1.refillTank(100);}, "Amount to refill tank by cannot exceed tank capacity");

        assertEquals(f1.getRemainingRange(), 472, .1, "Remaining range should be 472");

        assertEquals(f1.toString(), "Ford Frivolous (118 mi)", "toString does not match");
        
        //Stopped at row 26 on excel file
        assertThrows(IllegalArgumentException.class, () -> {f1.roadTrip(50, 50, 50, -100)}, "Mileage in any position of the list cannot be negative");
        
        f1.roadTrip(100, 100, 100, 100);
        assertEquals(f1.getMileage(), 590, .1, "Mileage should be 590");
        
        assertEquals(f1.getRemainingRange(), 0, .1, "Remaining range should be 0");

        f1.refillTank(10);
        assertEquals(f1.getFuelLevel(), 10, .1, "Fuel level should now be 10");

        f1.roadTrip(100, 100, 36);

        assertEquals(f1.getRemainingRange(), 0, .1, "Remaining range should be 0");


        // c1.drive(200);
        // assertEquals(c1.getMileage(), 230, .1, "Mileage should be 230 after second drive.");

        // assertEquals(c1.getRemainingRange(), c1.getFuelCapacity() * c1.getMPG() - 230, .1, "Remaining range of car not correct after driving twice.");

        // assertFalse(c1.canDrive(252), "Driving 252 should fail.");
        // assertTrue(c1.canDrive(251), "Driving 251 should succeed.");

        // c1.drive(251);
        // assertEquals(c1.getMileage(), 481, .1, "Mileage should be 481 after third drive.");

        // assertThrows(IllegalArgumentException.class, () -> {c1.drive(5);}, "Driving beyond empty should fail.");


        return getFailedCount();
    }
}
