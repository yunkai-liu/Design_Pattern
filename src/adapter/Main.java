package adapter;

public class Main 
{	
	public static void main(String[] args)
	{
		Target t1 = new Target();
		Target t2 = new Adapter();
		
		t1.request();
		t2.request();
	}
}