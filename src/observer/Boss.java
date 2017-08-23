package observer;

public class Boss extends Suject
{
	public Boss()
	{
		setName("Boss");
	}
	
	public void notifyAllListeners()
	{
		for(ObserverListener ol : this.getObservers())
		{
			ol.ActionTo(new ObserverEvent(this));
		}
	}
}