package simpleFactory;

public class Main 
{
	public static void main(String[] args)
	{
		Operation oper = OperationFactory.createOperate("/");
		oper.setNumberA(4);
		oper.setNumberB(2);
		
		System.out.println(oper.getResult());
	}
}