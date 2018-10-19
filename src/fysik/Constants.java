package fysik;

public enum Constants {

	G(9.82),
	R(8.3145), 
	P_0(100),
	C(299792458), 
	g_swe(9.78);

	public double value;

	Constants(double val) {
		this.value = val;
	}

}

//för att få en value måste jag skriva "constants.g.value"