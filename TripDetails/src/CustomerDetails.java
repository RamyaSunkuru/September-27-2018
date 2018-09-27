
public class CustomerDetails extends PersonDetails{

	PaymentCredentials credentials;
	public  CustomerDetails (int customerId,String customerName,String customerAddress,PaymentCredentials credentials) {
		super(customerId,customerName,customerAddress);
		this.credentials = credentials;
	
	}
	

	
	public PaymentCredentials getcredentials(){
		return credentials;
	}
	
	

}
