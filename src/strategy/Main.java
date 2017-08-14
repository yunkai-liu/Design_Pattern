package strategy;

public class Main 
{
	public static void main(String[] args) 
	{
		Strategy s = new ConcreteStrategyA();
		Context c = new Context(s);
		c.doSomething();
	}
}