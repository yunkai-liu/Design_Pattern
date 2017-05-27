package abstractFactory;

public class AccessUser implements IUser
{
	@Override
	public void insert(User user) 
	{
		System.out.println("Inser into user table with Access");
	}

	@Override
	public User getUser(int id) 
	{
		System.out.println("Get a user from user table with Access");
		return null;
	}
}