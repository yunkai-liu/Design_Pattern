package templateMethod;

public class Main 
{
	public static void main(String[] args) 
	{
		TestPaper tpa = new TestPaperA();
		tpa.testQuestion1();
		tpa.testQuestion2();
		
		TestPaper tpb = new TestPaperB();
		tpb.testQuestion1();
		tpb.testQuestion2();
	}
}