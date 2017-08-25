package bridge;

public class HandPhoneBrandM extends HandPhone
{
	public HandPhoneBrandM(Soft soft)
	{
		super(soft);
	}

	@Override
	public void run() 
	{
		System.out.println("Brand M: " + getSoft().run());
	}
}