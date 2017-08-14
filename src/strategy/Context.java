package strategy;

public class Context 
{
	private Strategy strategy;

	public Context(Strategy strategy) 
	{
		this.strategy = strategy;
	}
	
	public void doSomething()
	{
		strategy.algorithm();
	}

	public Strategy getStrategy() 
	{
		return strategy;
	}

	public void setStrategy(Strategy strategy) 
	{
		this.strategy = strategy;
	}
}