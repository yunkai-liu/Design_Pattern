package state;

public class EveningState extends State
{
	@Override
	public void writeProgramm(Work work)
	{
		if(work.isFinish())
		{
			work.setCurrent(new RestState());
			work.writeProgramm();
		}
		else
		{
			if(work.getHour() < 21)
			{
				System.out.println("Evening: working overtime!");
			}
			else
			{
				work.setCurrent(new SleepingState());
				work.writeProgramm();
			}
		}
	}
}