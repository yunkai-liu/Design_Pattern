package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate
{
	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() 
	{
		return new ConcreteIterator(this);
	}
	
	public int count()
	{
		return items.size();
	}
	
	public Object get(int index)
	{
		return items.get(index);
	}
	
	public ConcreteAggregate insert(Object o)
	{
		items.add(o);
		return this;
	}
}