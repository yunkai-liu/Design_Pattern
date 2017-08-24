package chainOfResponsibility;

public abstract class Manager
{
	private String level;
	private Manager superior;
	
	public Manager(String level) 
	{
		this.level = level;
	}
	
	public abstract void handleRequest(Request request);

	public String getLevel() 
	{
		return level;
	}
	
	public void setLevel(String level)
	{
		this.level = level;
	}
	
	public Manager getSuperior() 
	{
		return superior;
	}
	
	public void setSuperior(Manager superior)
	{
		this.superior = superior;
	}
}