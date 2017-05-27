package abstractFactory;

public class SqlServerDeparment implements IDepartment 
{
	@Override
	public void insert(Department department) 
	{
		System.out.println("Inser into department table with SQL Server");
	}

	@Override
	public Department getDepartment(int id)
	{
		System.out.println("Get a department from department table with SQL Server");
		return null;
	}
}