package simpleFactory;

public class Add extends Operation 
{
	@Override
	public double getResult() 
	{
		return getNumberA() + getNumberB();
	}
}