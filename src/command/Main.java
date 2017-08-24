package command;

public class Main 
{
	public static void main(String[] args) 
	{
		Barbecuer barbecuer = new Barbecuer();
		Waiter waiter = new Waiter();
		
		waiter.addCommand(new BakeMuttonCommand(barbecuer));
		waiter.addCommand(new BakeMuttonCommand(barbecuer));
		waiter.addCommand(new BakeChickenWingCommand(barbecuer));
		
		waiter.executeAllCommands();
	}
}