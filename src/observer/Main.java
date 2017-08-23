package observer;

public class Main 
{
	public static void main(String[] args)
	{
		Suject suject = new Boss();
		suject.addListener(new StockObserver());
		suject.addListener(new NBAObserver());
		
		suject.notifyAllListeners();
	}
}