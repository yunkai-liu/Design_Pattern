package observer;

public class Secretary extends Suject
{	
	public Secretary()
	{
		setName("Secretary");
	}
	
	public void notifyAllListeners()
	{
		for(ObserverListener ol : this.getObservers())
		{
			ol.ActionTo(new ObserverEvent(this));
		}
	}
}