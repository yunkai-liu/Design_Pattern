package observer;

public class StockObserver implements ObserverListener
{
	@Override
	public void ActionTo(ObserverEvent event) 
	{
		System.out.println(event.getSource().getName() + ": close stock, to work!");
	}
}