package factoryMethod;

public class Main 
{
	public static void main(String[] args)
	{
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreateOperation();
		
		oper.setNumberA(2);
		oper.setNumberB(4);
		
		System.out.println(oper.getResult());
	}
}