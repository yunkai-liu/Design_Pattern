package proxy;

public class Proxy implements Pursuit
{
	private Boy boy;

	public Proxy(Boy boy)
	{
		this.boy = boy;
	}

	@Override
	public void giveFlower() 
	{
		System.out.print(boy.getName()+" ");
		boy.giveFlower();
	}

	@Override
	public void giveRing() 
	{
		System.out.print(boy.getName()+" ");
		boy.giveRing();
	}
	
	public Boy getBoy() 
	{
		return boy;
	}

	public void setBoy(Boy boy) 
	{
		this.boy = boy;
	}
}