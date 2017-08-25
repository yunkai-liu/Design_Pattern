package bridge;

public abstract class HandPhone
{
	private Soft soft;

	public HandPhone(Soft soft) 
	{
		this.soft = soft;
	}
	
	public abstract void run();

	public Soft getSoft() 
	{
		return soft;
	}

	public void setSoft(Soft soft)
	{
		this.soft = soft;
	}
}