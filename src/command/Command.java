package command;

public abstract class Command
{
	private Barbecuer barbecuer;

	public Command(Barbecuer barbecuer) 
	{
		this.barbecuer = barbecuer;
	}
	
	public abstract void executeCommand();

	public Barbecuer getBarbecuer() 
	{
		return barbecuer;
	}

	public void setBarbecuer(Barbecuer barbecuer) 
	{
		this.barbecuer = barbecuer;
	}
}