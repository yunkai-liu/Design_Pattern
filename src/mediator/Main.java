package mediator;

public class Main 
{
	public static void main(String[] args) 
	{
		UnitedNation un = new SecurityCouncil();
		
		Country usa = new USA(un);
		Country iraq = new Iraq(un);
		un.setCountry1(usa);
		un.setCountry2(iraq);
		
		usa.declare("nuclear weapon is forbidden!");
		iraq.declare("we don't care!");
	}
}