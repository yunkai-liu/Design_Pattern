package factoryMethod;

public class DivFactory implements IFactory 
{
	@Override
	public Operation CreateOperation() 
	{
		return new Div();
	}
}