package factoryMethod;

public class Mul extends Operation 
{
	@Override
	public double getResult() 
	{
		return getNumberA() * getNumberB();
	}
}