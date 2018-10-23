package fysik;

public class physics {

		static double G = 9.82;
		static double ATM = 101.3E3; // 101.3 kPa
		static double R = 8.3144598;
		static double p_0 = 101325;
		static double c = 299792458;
		static double g_swe = 9.82;
	
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
	  return (fahrenheit -32) /1.8;
	 
	    
	
	}
	
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	
	/**
	 * 
	 * r�knar ut trycker p� viss en v�tska vid ett viss djup
	 * 
	 * @param fluid = vilken v�dska det �r
	 * @param depth = i vilket djup tricket m�ts (i meter)
	 * @return
	 */
	
	
	public static double fluidPressure(FluidTable fluid, double depth) {
		
		return fluid.density * G * depth;
		
	}
	
	
	
	
	public static double pressureUnderWater(double depth) {
		
		
		return FluidTable.H2O.density * G * depth;
   
		
	}
	
	
	public static double kineticEnergy(double mass, double velocity) {
		
		
		return (mass * (velocity * velocity) ) / 2;
}
	
	public static double potentialEnergy(double mass, double height) {
		
		return mass * G * height;
		
	}
	
	public static double fallSpeed(double height) {
		
		return height / (G * G);
		
	}
	
	
	public static double delta(double first, double last) {
		
		
		return last - first;
	}

	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return fluid.density * volume;
	}
	
	
	
	public static double volumeToMass(GasTable gas, double volume) {
		return gas.density * volume;
	
	}
	
	
	
	public static double volumeToMass(SolidTable solid, double volume) {
		return solid.density * volume;
	
	
	}
	
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	
	
	}
	
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	
	}
	
	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	
	
	}
	
	
	
	public static double work(double mass, double acceleration) {
		return mass * acceleration;
	
	
	}
	
	
	
	public static double power(double work, double time) {
		return work / time;
	}
	
	
	
	
	
	
	
	
	public static double velocityToHeight(double velocity) {
	
		
		return velocity * velocity / (2 * G);
	}
	
	
	
	public static double kilogramsToNewton(double kg) {
	
		
		return kg * G;
}
	
}
