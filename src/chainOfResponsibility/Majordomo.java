package chainOfResponsibility;

public class Majordomo extends Manager
{
	public Majordomo(String level) 
	{
		super("Majordomo");
	}

	@Override
	public void handleRequest(Request request) 
	{
		if(request.getSalary() <= 20000)
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