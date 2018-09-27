
public class VehicleDetails {
	int vehicleId;
	int vehicleRegNum;
	String vehicleOwner;
	String vehicleType;
	
public  VehicleDetails(int vehicleId,int vehicleRegNum,String vehicleOwner,String vehicleType) {
	this.vehicleId=vehicleId;
	this.vehicleRegNum=vehicleRegNum;
	this.vehicleOwner= vehicleOwner;
	this.vehicleType = vehicleType;
	
}

public int getMilePrice(String vehicleType)
{
	switch(vehicleType)
	{
	case "car" : 
		return 100;
	case "bus" :
		return 50;
	case "auto":
		return 25;
	default :
		return 0;
		
	}
		
}

public int getvehicleRegNum()
{
	return vehicleRegNum;
	
}

public int getvehicleId() {
	return vehicleId;
}
public String getvehicleOwner()
{
	return  vehicleOwner;
}
public String getvehicleType()
{
	return vehicleType;
}
    
}
