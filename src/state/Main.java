package state;

public class Main 
{
	public static void main(String[] args) 
	{
		Work work = new Work();
		
		work.setHour(9);
		work.writeProgramm();
		work.setHour(10);
		work.writeProgramm();
		work.setHour(12);
		work.writeProgramm();
		work.setHour(13);
		work.writeProgramm();
		work.setHour(14);
		work.writeProgramm();
		work.setHour(17);
		work.writeProgramm();
		
		//work.setFinish(true);
		work.setHour(19);
		work.writeProgramm();
		work.setHour(22);
		work.writeProgramm();
	}
}