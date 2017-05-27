package factoryMethod;

public class SubFactory implements IFactory 
{
	@Override
	public Operation CreateOperation() 
	{
		return new Sub();
	}
}