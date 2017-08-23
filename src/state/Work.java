package state;

public class Work 
{
	private State current;
	private int hour;
	private boolean finish = false;
	
	public Work()
	{
		current = new ForenoonState();
	}
	
	public void writeProgramm()
	{
		current.writeProgramm(this);
	}
	
	public State getCurrent() 
	{
		return current;
	}

	public void setCurrent(State current)
	{
		this.current = current;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public void setHour(int hour) 
	{
		this.hour = hour;
	}
	
	public boolean isFinish() 
	{
		return finish;
	}
	
	public void setFinish(boolean finish) 
	{
		this.finish = finish;
	}
}