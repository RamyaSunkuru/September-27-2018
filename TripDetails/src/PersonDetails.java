
public class PersonDetails {
	int personId;
	String personName;
	String personAddress;
	
	public PersonDetails(int personId, String personName, String personAddress) {
		this.personId= personId;
		this.personName= personName;	
		this.personAddress=personAddress;
	}
	public int getpersonId() {
		return personId;
	}

	public String getpersonAddress()
	{
		return personAddress;
	}
	public String getpersonName()
	{
		return personName;
	}
}
