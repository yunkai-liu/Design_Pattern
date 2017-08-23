package state;

public class NoonState extends State
{
	@Override
	public void writeProgramm(Work work)
	{
		if(work.getHour() < 13)
		{
			System.out.println("Noon: lunching!");
		}
		else
		{
			work.setCurrent(new AfternoonState());
			work.writeProgramm();
		}
	}
}