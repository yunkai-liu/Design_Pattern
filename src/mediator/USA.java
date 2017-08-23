package mediator;

public class USA extends Country
{
	public USA(UnitedNation unitedNation)
	{
		super(unitedNation);
	}

	@Override
	public void declare(String message) 
	{
		getUnitedNation().declare(message, this);
	}

	@Override
	public void getMessage(String message) 
	{
		System.out.println("USA get message from Iraq: " + message);
	}
}