package abstractFactory;

public class AccessDepartment implements IDepartment 
{
	@Override
	public void insert(Department department) 
	{
		System.out.println("Inser into department table with Access");
	}

	@Override
	public Department getDepartment(int id) 
	{
		System.out.println("Get a department from department table with Access");
		return null;
	}
}