package chainOfResponsibility;

public class GeneralManager extends Manager
{
	public GeneralManager(String level) 
	{
		super("General Manager");
	}

	@Override
	public void handleRequest(Request request) 
	{
		if(request.getSalary() <= 40000)
		{
			System.out.println(getLevel() + ": accepted!");
		}
		else
		{
			if(getSuperior() != null)
			{
				getSuperior().handleRequest(request);
			}
			else
			{
				System.out.println("considering...");
			}
		}
	}
}