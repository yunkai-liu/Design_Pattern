package abstractFactory;

public class SqlServerUser implements IUser 
{
	@Override
	public void insert(User user) 
	{
		System.out.println("Inser into user table with SQL Server");
	}

	@Override
	public User getUser(int id)
	{
		System.out.println("Get a user from user table with SQL Server");
		return null;
	}
}