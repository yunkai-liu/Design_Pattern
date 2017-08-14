package proxy;

public class Boy implements Pursuit
{
	private String name;
	private Girl girl;

	public Boy(String name, Girl girl) 
	{
		this.name = name;
		this.girl = girl;
	}

	@Override
	public void giveFlower() 
	{
		System.out.println("will give " + girl.getName() + " flowers!");
	}

	@Override
	public void giveRing() 
	{
		System.out.println("will give " + girl.getName() + " rings!");
	}
	
	public String getName()
	{
		return name;
	}
	
	public Girl getGirl() 
	{
		return girl;
	}

	public void setGirl(Girl girl) 
	{
		this.girl = girl;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}