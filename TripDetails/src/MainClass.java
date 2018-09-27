/*
Let us say you are building an app for a rideshare company like Uber
or Ola and you are asked to represent the following entities and their
relationship using object oriented principles. You can use any object
oriented language of your choice.
a. The company hires many drivers.
b. Capture the name, address, date of birth, license number for
each driver.
c. Drivers drive vehicles.
d. Vehicles can be of type car, bus or auto. The fare to be charged
depends on the vehicle type.
e. Driver makes trip. A trip is when the vehicle has a customer
sitting inside and goes from point A to B. Driver is paid per the
miles driven while on the trip
f. Capture the following for each vehicle - vehicle registration
number, number of miles on odometer, the name of the
owner.
g. Capture the following information for each customer - Name,
address, Credit card info.
h. Associate the trips to a driver, vehicle and a customer.
*/
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
