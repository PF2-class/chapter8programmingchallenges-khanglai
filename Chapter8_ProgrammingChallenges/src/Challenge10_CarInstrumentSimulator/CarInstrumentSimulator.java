package Challenge10_CarInstrumentSimulator;

public class CarInstrumentSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CarInstrumentSimulator carInstrumentSimulator = new CarInstrumentSimulator();
		FuelGauge fuel = new FuelGauge();
		Odometer odo = new Odometer(0,fuel);
		
		for(int i = 0; i < FuelGauge.MAX_GALLONS; i++) {
			fuel.fullfilsFuel();
		}
		while(fuel.getGallons() > 0) {
			odo.addMiles();
		
			// Display the mileage.
			System.out.println("Miles: " + odo.getMiles());

			// Display the amount of fuel.
			System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
			System.out.println("------------------------------");
		
		}

	}
}


