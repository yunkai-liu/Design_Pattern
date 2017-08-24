package chainOfResponsibility;

public class CommonManager extends Manager
{
	public CommonManager(String level) 
	{
		super("Common Manager");
	}

	@Override
	public void handleRequest(Request request) 
	{
		if(request.getSalary() <= 10000)
		{
			System.out.println(getLevel() + ": accepted!");
		}
		else
		{
			if(getSuperior() != null)
			{
				getSuperior().handleRequest(request);
			}
		}
	}
}