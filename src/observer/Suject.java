package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Suject
{
	private String name;
	private List<ObserverListener> observers = new ArrayList<ObserverListener>();

	public void addListener(ObserverListener observerListener)
	{
		observers.add(observerListener);
	}
	
	public abstract void notifyAllListeners();
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public List<ObserverListener> getObservers() 
	{
		return observers;
	}

	public void setObservers(List<ObserverListener> observers) 
	{
		this.observers = observers;
	}
}