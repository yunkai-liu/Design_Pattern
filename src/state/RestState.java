package state;

public class RestState extends State
{
	@Override
	public void writeProgramm(Work work)
	{
		System.out.println("After working hours!");
	}
}