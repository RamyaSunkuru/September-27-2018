
public class PaymentCredentials {
	int paymentAccount;
	int paymentId;
	
public PaymentCredentials (int paymentId,int paymentAccount)
{
	this.paymentAccount= paymentAccount;
	
	this.paymentId= paymentId;
}
public int getpaymentAccount() {
	return paymentAccount;
}
public int getpaymentId()
{
	return paymentId;
}


}
