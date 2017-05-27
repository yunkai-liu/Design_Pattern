package factoryMethod;

public class AddFactory implements IFactory 
{
	@Override
	public Operation CreateOperation() 
	{
		return new Add();
	}
}