package bridge;

public class HandPhoneBrandN extends HandPhone
{
	public HandPhoneBrandN(Soft soft)
	{
		super(soft);
	}

	@Override
	public void run() 
	{
		System.out.println("Brand N: " + getSoft().run());
	}
}