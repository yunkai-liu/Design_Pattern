package iterator;

public class Main 
{
	public static void main(String[] args)
	{
		ConcreteAggregate ca = new ConcreteAggregate();
		ca.insert("aa").insert("bb").insert("cc").insert("dd").insert("ee").insert("ff");
		
		//Iterator it = new ConcreteIterator(ca);
		Iterator it = new ConcreteIteratorDesc(ca);
		while(!it.isDone())
		{
			System.out.println(it.currentItem());
			it.next();
		}
	}
}