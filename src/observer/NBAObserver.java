package observer;

public class NBAObserver implements ObserverListener
{
	@Override
	public void ActionTo(ObserverEvent event) 
	{
		System.out.println(event.getSource().getName() + ": close NBA, to work!");
	}
}