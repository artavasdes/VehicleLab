package tests;

import vehicle.ChevroletBird;
import bcatest.BCATestScenario;

public class Group1_5_ChevroletBird1_Constructors extends BCATestScenario {

	public int runTest() {
        ChevroletBird c1 = new ChevroletBird(2018);

        assertEquals(c1.getMileage(), 0, .1, "Default mileage should be zero.");

        assertTrue(c1.checkWingsExtended(), "Wings must start un-extended" );


        //assertEquals(c1.getRemainingRange(), , .1, "The car should begin full.");

        //assertEquals(c1.getMPG(), 33.2, .1, "Initial mpg not correct." );

        //assertEquals(c1.getRemainingRange(), c1.getFuelCapacity() * c1.getMPG(), .1, "Remaining range of car not correct at creation.");

        assertEquals(c1.toString(), "2018 Chevrolet Bird (0.0 mi)", "toString does not match");

        return getFailedCount();
    }


    
}