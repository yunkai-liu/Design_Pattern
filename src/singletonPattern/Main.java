package singletonPattern;

public class Main 
{
	public static void main(String[] args) 
	{
		SingletonStatic s1 = SingletonStatic.getInstance();
		SingletonStatic s2 = SingletonStatic.getInstance();
		
		if(s1 == s2)
		{
			System.out.println("The two objects are the same instance.");
		}
	}
}