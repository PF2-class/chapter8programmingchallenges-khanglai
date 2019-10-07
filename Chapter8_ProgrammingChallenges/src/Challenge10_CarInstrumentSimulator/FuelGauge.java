package Challenge10_CarInstrumentSimulator;

public class FuelGauge {
	final static int MAX_GALLONS = 15;
	private int gallons;
	
	public FuelGauge() {
		this.gallons = 0;
	}
	
	public FuelGauge(int gallons) {
		if(gallons < MAX_GALLONS)
			this.gallons = gallons;
		else
			this.gallons = MAX_GALLONS;
	}

	public double getGallons() {
		return gallons;
	}
	
	/*o	To be able to increment the amount of fuel by 1 gallon. 
	 * This simulates putting fuel in the car. 
	 * (The car can hold a maximum of 15 gallons.)
	 */
	public void fullfilsFuel() {
		if(gallons < MAX_GALLONS)
			gallons++;
		else
			System.out.println("Full of fuel !");
	}
	
	/*	To be able to decrement the amount of fuel by 1 gallon, if the amount of fuel is greater than 0 gallons.
	This simulates burning fuel as the car runs.*/
	public void burnFuel() {
		if(gallons > 0)
			gallons--;
		else
			System.out.println("Out of fuel !");
	}
	
}
