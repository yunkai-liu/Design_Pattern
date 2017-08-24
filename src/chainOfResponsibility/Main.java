package chainOfResponsibility;

public class Main 
{
	public static void main(String[] args)
	{
		Manager commonManager = new CommonManager("Common Manager");
		Manager majordomo = new Majordomo("Majordomo");
		Manager generalManager = new GeneralManager("General Manager");
		commonManager.setSuperior(majordomo);
		majordomo.setSuperior(generalManager);
		
		Request request = new Request(40000);
		commonManager.handleRequest(request);
	}
}