package proxy;

public class Main 
{
	public static void main(String[] args) 
	{
		Girl girl = new Girl("girl");
		Proxy proxy = new Proxy(new Boy("boy", girl));
		proxy.giveFlower();
		proxy.giveRing();
	}
}