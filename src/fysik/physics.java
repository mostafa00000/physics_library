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
	 * räknar ut trycker på viss en vätska vid ett viss djup
	 * 
	 * @param fluid = vilken vädska det är
	 * @param depth = i vilket djup tricket mäts (i meter)
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
	
	
	
	

}