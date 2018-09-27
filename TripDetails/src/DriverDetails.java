
public class DriverDetails extends PersonDetails{

	int driverDOB;
	int driverLicenseNumber;
	
	
	

	public DriverDetails(int driverId,String driverName,String driverAddress,int driverDOB,int driverLicenseNumber) {
		super(driverId,driverName,driverAddress);
		this.driverDOB=driverDOB;
		this.driverLicenseNumber=driverLicenseNumber;
//		this.driverId=driverId;
//		this.driverName= driverName;
		
		
	}
	
	public int getDOB() {
		return driverDOB;	
	}
	
	public int getdriverLicenseNumber()
	{
		return driverLicenseNumber;
	}
	

}
