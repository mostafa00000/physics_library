package fysik;

public class physics {

		static double G = 9.82;
		static double ATM = 101.3E3; // 101.3 kPa
		static double R = 8.3144598;
		static double p_0 = 101325;
		static double c = 299792458;
		static double g_swe = 9.82;
	
	
	/**
	 * converterar farenheit till celsius
	 * 	
	 * @param fahrenheit 
	 * @return 
	 */
		
	public static double fahrenheitToCelsius(double fahrenheit) {
		
	  return (fahrenheit -32) /1.8;
	 
	    
	
	}
	
	/**
	 *  converterar kelvin till celsius 
	 * 
	 * @param kelvin
	 * @return
	 */
	
	public static double kelvinToCelsius(double kelvin) {
		return kelvin + -273.15;
	}
	
	
	/**
	 * 
	 * r�knar ut trycket p� viss en v�tska vid ett viss djup
	 * 
	 * @param fluid = vilken v�dska det �r
	 * @param depth = i vilket djup tricket m�ts (i meter)
	 * @return
	 */
	
	
	public static double fluidPressure(FluidTable fluid, double depth) {
		
		return fluid.density * G * depth;
		
	}
	
	
	/**
	 * 
	 * r�knar ut trycket under vatten vid ett viss djup
	 * 
	 * @param depth = vilket djup trycket br�knas
	 * @return
	 */
	
	public static double pressureUnderWater(double depth) {
		
		
		return FluidTable.H2O.density * G * depth;
   
	}
	
	
	/**
	 * 
	 * r�knar ut kinetiskt energi p� ett objekt
	 * 
	 * 
	 * @param mass = massan p� objectet
	 * @param velocity = hastigheten op objektet
	 * @return
	 */
	
	public static double kineticEnergy(double mass, double velocity) {
		
		
		return (mass * (velocity * velocity)  / 2);
}
	
	
	/**
	 * 
	 * r�knart den potencialla energin p� ett objekt
	 * 
	 * @param mass = massan p� objectet
	 * @param height = h�jden p� obectet 
	 * @return
	 */
	
	public static double potentialEnergy(double mass, double height) {
		
		return mass * G * height;
		
	}
	
	
	/**
	 * 
	 * r�knar ut hastigheten p� ett fallande objekt
	 * 
	 * @param height = h�jden objectet f�ll fr�n
	 * @return
	 */
	
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2*G*height);
		
	}
	
	
	/**
	 * 
	 * r�knar ut skillnaden p� tv� nummer
	 * 
	 * @param first = f�rsta nummret
	 * @param last = andra nummret
	 * @return
	 */
	
	public static double delta(double first, double last) {
		
		
		return last - first;
	}

	
	
	/**
	 * 
	 * converterar v�tskas volym till massa 
	 * 
	 * @param fluid = 
	 * @param volume =
	 * @return
	 */
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return fluid.density * volume;
	}
	
	
	
	/**
	 * 
	 * converterar gas volym till massa
	 * 
	 * @param gas
	 * @param volume
	 * @return
	 */
	
	public static double volumeToMass(GasTable gas, double volume) {
		return gas.density * volume;
	
	}
	
	
	/**
	 * 
	 * converterar solid(????) (svesnka?) volym till massa
	 * 
	 * @param solid
	 * @param volume
	 * @return
	 */
	
	public static double volumeToMass(SolidTable solid, double volume) {
		return solid.density * volume;
	
	
	}
	
	
	/**
	 * 
	 * r�nar ut hastigheten med hj�p av svt metoden
	 * 
	 * @param distance
	 * @param time
	 * @return
	 */
	
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	
	
	}
	
	
	/**
	 * 
	 * r�nar ut str�ckan med hj�p av svt metoden
	 * 
	 * @param velocity
	 * @param time
	 * @return
	 */
	
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	
	}
	
	
	/**
	 * 
	 * r�nar ut tid med hj�p av svt metoden
	 * 
	 * @param distance
	 * @param velocity
	 * @return
	 */
	
	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	
	
	}
	
	
	
	/**
	 * 
	 * r�knar ut arbete p� ett objekt
	 * 
	 * @param mass = massan p� objektet
	 * @param acceleration = accelartionen p� objectet
	 * @return
	 */
	
	public static double work(double mass, double acceleration) {
		return mass * acceleration;
	
	
	}
	
	
	/**
	 * 
	 * r�knar ut kraften p� ett obkjekt
	 * 
	 * @param work = objektets arbete
	 * @param time = tid(??)
	 * @return
	 */
	
	public static double power(double work, double time) {
		return work / time;
	}
	
	
	
	
	/**
	 * 
	 * converterar hastighet till h�jd
	 * 
	 * @param velocity = hastigeten 
	 * @return
	 */
	
	public static double velocityToHeight(double velocity) {
	
		
		return velocity * velocity / (2 * G);
	}
	
	

	/**
	 * 
	 * r�knar ut v�rmen p� en solid(??) (lol kan inte svenska)
	 * 
	 * @param solid
	 * @param mass
	 * @param deltaT
	 * @return
	 */
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		
		
		return solid.heatCapacity * mass * (Math.abs(deltaT));
	}
	
	
	
	/**
	 * 
	 * r�knar ut v�rmen p� en v�tska
	 * 
	 * @param fluid
	 * @param volume
	 * @param deltaT
	 * @return
	 */
	
	public static double heat(FluidTable fluid, double volume, double deltaT) {
	
		
		return fluid.heatCapacity * volume * fluid.density * (Math.abs(deltaT));
	}
	
	
	/**
	 * 
	 * r�knar ut v�rmen p� en gas
	 * 
	 * @param gas
	 * @param volume
	 * @param deltaT
	 * @return
	 */
	
	public static double heat(GasTable gas, double volume, double deltaT) {
	
		
		return gas.heatCapacity * volume * gas.density * (Math.abs(deltaT));
	}

	
		

	//MINA EGNA METODER!

	
	public static double CelciusToFarenheit(double celsius) {
		
		return celsius*1.8+32;
	}
	
	
	public static double CeslciusToKalvin(double kelvin) {
		return kelvin - +273.15;
	}

	public static double pressureUnderSulfuricAcid(double depth) {
		
		
		return FluidTable.H2SO4.density * G * depth; 
	
	}


	/**
	 * 
	 * r�relsem�ngd
	 * 
	 * @param mass
	 * @param velocity
	 * @return
	 */
	
	public static double RorelseMangd(double mass, double velocity) {

		return mass * velocity;
		
	}
	

	public static double TyngdKraft(double mass) {
		
		return mass*G;
	}

	
	/**
	 * 
	 * R�KNAR UT FRICTION
	 * 
	 * @param GF = glidfriktionstalet
	 * @param N = normalkraften
	 * @return
	 */
	
	public static double friction(double GF, double N) {
		
		return GF*N;
	}
	
	
	/**
	 * 
	 * sm�ltning 
	 * 
	 * @param Cs = specifik sm�tentalpi
	 * @param mass 
	 * @param deltaT = �ndring p� denmratur
	 * @return
	 */
	
	public static double Smaltning(double Cs, double mass, double deltaT) {
		
		return Cs*mass*deltaT;
	}
	
	public static double densitet(double mass, double volume) {
		
		
		
		return mass / volume;
	}
	
	
	/**
	 * 
	 * fj�derkraft
	 * 
	 * @param k = fj�derkonstanten
	 * @param x = fj�derns f�rl�ngning
	 * @return
	 */
	
	public static double fjaderKraft(double k, double x) {
		
		return k * x;
		
	}

	public static double tryck(double F, double A) {
		
		
		return F/A;
		
	}
	
}




	

