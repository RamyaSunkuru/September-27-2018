
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example to get the fare from the trip.
		
		PaymentCredentials payment = new PaymentCredentials(1,1234);
		CustomerDetails customerList = new CustomerDetails(1,"Ramya","Bangalore",payment);
		DriverDetails driverList= new DriverDetails(1,"raju","Chennai",0405,450);
		VehicleDetails vehicleList = new VehicleDetails(1,1111,"Arun","car");
		
		TripDetails trip = new TripDetails(1,driverList,customerList,vehicleList,12);
		
		System.out.print(trip.getFare(trip.getodometer()));
		

	}

}
