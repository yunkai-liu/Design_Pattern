package facade;

public class Facade 
{
	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;
	
	public Facade()
	{
		this.one = new SubSystemOne();
		this.two = new SubSystemTwo();
		this.three = new SubSystemThree();
		this.four = new SubSystemFour();
	}
	
	public void methodA()
	{
		System.out.println("method A ----");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}
	
	public void methodB()
	{
		System.out.println("method B ----");
		two.methodTwo();
		three.methodThree();
	}
}