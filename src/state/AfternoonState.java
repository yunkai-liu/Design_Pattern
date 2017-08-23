package state;

public class AfternoonState extends State
{
	@Override
	public void writeProgramm(Work work)
	{
		if(work.getHour() < 17)
		{
			System.out.println("Afternoon: working!");
		}
		else
		{
			work.setCurrent(new EveningState());
			work.writeProgramm();
		}
	}
}