package Challenge10_CarInstrumentSimulator;

public class Odometer {
	public final int MAX_MILES = 999999;
    public final int MILES_PER_GALLONS = 24;
	private int firstMiles;
	private int miles;
	private FuelGauge fuelgauge;
	
	public Odometer(int miles, FuelGauge fuelgauge) {
		super();
		this.firstMiles = miles;
		this.miles = miles;
		this.fuelgauge = fuelgauge;
	}

	public double getMiles() {
		return miles;
	}

	public void addMiles() {
		if(miles < MAX_MILES)
			miles++;
		else 
			miles = 0;
		
		int drivingMiles = firstMiles - miles;
		if(drivingMiles % MILES_PER_GALLONS == 0)
			fuelgauge.burnFuel();
	}
	
	
}
