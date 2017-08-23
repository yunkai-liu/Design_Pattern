package state;

public class SleepingState extends State
{
	@Override
	public void writeProgramm(Work work)
	{
		System.out.println("Sleeping!");
	}
}