package factoryMethod;

public class Div extends Operation 
{
	@Override
	public double getResult() 
	{
		if(getNumberB() == 0)
		{
			throw new ArithmeticException("/ by zero");
		}
		
		return getNumberA() / getNumberB();
	}
}