package bridge;

public class Main 
{
	public static void main(String[] args) 
	{
		HandPhone n = new HandPhoneBrandN(new GameSoft());
		n.run();
		n.setSoft(new AddressListSoft());
		n.run();
		
		HandPhone m = new HandPhoneBrandM(new GameSoft());
		m.run();
		m.setSoft(new AddressListSoft());
		m.run();
	}
}