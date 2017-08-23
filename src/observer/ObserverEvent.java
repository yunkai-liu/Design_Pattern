package observer;

public class ObserverEvent
{
	private Suject source;

	public ObserverEvent(Suject source) 
	{
		this.source = source;
	}

	public Suject getSource()
	{
		return source;
	}

	public void setSource(Suject source) 
	{
		this.source = source;
	}
}