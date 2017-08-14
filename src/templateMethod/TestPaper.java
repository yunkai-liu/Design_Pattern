package templateMethod;

public abstract class TestPaper 
{
	public void testQuestion1()
	{
		System.out.print("Question 1: ");
		System.out.println(answer1());
	}
	
	public void testQuestion2()
	{
		System.out.print("Question 2: ");
		System.out.println(answer2());
	}
	
	public abstract String answer1();
	
	public abstract String answer2();
}