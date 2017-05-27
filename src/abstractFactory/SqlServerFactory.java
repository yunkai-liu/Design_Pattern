package abstractFactory;

public class SqlServerFactory implements IFactory 
{
	@Override
	public IUser createUser() 
	{
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() 
	{
		return new SqlServerDeparment();
	}
}