package command;

public class BakeMuttonCommand extends Command
{
	public BakeMuttonCommand(Barbecuer barbecuer) 
	{
		super(barbecuer);
	}

	@Override
	public void executeCommand() 
	{
		getBarbecuer().bakeMutton();
	}
}