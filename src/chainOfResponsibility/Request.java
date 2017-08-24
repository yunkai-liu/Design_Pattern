package chainOfResponsibility;

public class Request 
{
	private int salary;
	
	public Request(int salary)
	{
		this.salary = salary;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
}