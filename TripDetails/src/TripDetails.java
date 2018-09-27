
public class TripDetails {
	int tripId;
	DriverDetails driver;
	CustomerDetails customer;
	VehicleDetails vehicle;
	int odometer;
	int fare=0;
	
	public TripDetails (int tripId,DriverDetails driver,CustomerDetails customer,VehicleDetails vehicle,int odometer)
	{
		this.tripId = tripId;
		this.driver = driver;
		this.customer = customer;
		this.vehicle=vehicle;
		this.odometer= odometer;
	}

	public int getodometer()
	{
		return this.odometer;
	}
	public int gettripId()
	{
		return tripId;
	}
	public int getFare(int odometer) {
		
		int odometerRate = vehicle.getMilePrice(vehicle.getvehicleType());
		fare = odometer*(odometerRate);
		return fare;
	}
	
	
		
}
