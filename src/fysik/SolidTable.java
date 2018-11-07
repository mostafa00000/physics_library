package fysik;



	public enum SolidTable {

		ICE(0.92, 2.2, 0, 334),
		IRON(7.87, 0.45, 1538, 276),
		aluminium(2.70, 0.90, 660, 397),
		zink(7.13, 0.39, 420, 117),
		guld(19.3, 0.13, 1064, 66),
		
		;

		double density;
		double heatCapacity;
		double smeltPoint;
		double smeltEntalpy;
		
		SolidTable(double d, double hc, double sp, double se) {
			density = d * 1E3;
			heatCapacity = hc * 1E3;
			smeltPoint = sp;
			smeltEntalpy = se * 1E3;
		}

		
	}


