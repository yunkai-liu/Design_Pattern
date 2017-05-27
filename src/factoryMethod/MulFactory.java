package factoryMethod;

public class MulFactory implements IFactory
{
	@Override
	public Operation CreateOperation()
	{
		return new Mul();
	}
}