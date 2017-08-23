package state;

public class ForenoonState extends State
{
	@Override
	public void writeProgramm(Work work)
	{
		if(work.getHour() < 12)
		{
			System.out.println("Forenoon: working!");
		}
		else
		{
			work.setCurrent(new NoonState());
			work.writeProgramm();
		}
	}
}