package mediator;

public class Iraq extends Country
{
	public Iraq(UnitedNation unitedNation)
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
		System.out.println("Iraq get message from USA: " + message);
	}
}