package fysik;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Answers {

public static void main(String[] args) {
	
	//uppgift 1 
	
	
	//System.out.println(SolidTable.IRON.density * 0.08);

	//uppgift 2
	
	//System.out.println(physics.svtDistance(2.8, 3600));
	
	//uppgift 3
	
	//System.out.println(FluidTable.H2O.heatCapacity * 5 * 1); /??????

	//uppgift 4
	
	//System.out.println((physics.pressureUnderWater(100) ) + "Pascal");
	
	//upgift 5
	
	//System.out.println(physics.velocityToHeight(50/3.6) + 1.80);
	
	//uppgift 6
	
	//System.out.println(physics.power(physics.work(740, 100), 4.4));
	
	//uppgift 7

		int studs = 0;  
	    for (double i = 10; i > 0.5;) {
	    	
	    	i = physics.velocityToHeight(physics.fallSpeed(i) - i/100);
	    	studs++;
	    	
	    }
	
	    System.out.println(studs);
	    
	//uppgift 8: Determine the kinetic energy of a 625-kg roller coaster car that is moving with a speed of 18.3 m/s
	
	//System.out.println(physics.kineticEnergy(625, 18.3));

	//uppgift 9:  A cart is loaded with a brick and pulled at constant speed along an inclined plane to the height of a seat-top. 
	//If the mass of the loaded cart is 3.0 kg and the height of the seat top is 0.45 meters, then what is the potential energy of the loaded cart at the height of the seat-top?

	//System.out.println(physics.potentialEnergy(3, 0.45)+ "jules");
	
	//uppgift 10: A tired squirrel (mass of approximately 1 kg) does push-ups by applying a force to elevate its center-of-mass by 5 cm in order to do a mere 0.50 Joule of work. 
	//If the tired squirrel does all this work in 2 seconds, then determine its power.

	//System.out.println(physics.power(0.5, 2.0) + "watts");
	
}

}