package mediator;

public class SecurityCouncil extends UnitedNation
{
	@Override
	public void declare(String message, Country country) 
	{
		if(country == getCountry1())
		{
			getCountry2().getMessage(message);
		}
		else if(country == getCountry2())
		{
			getCountry1().getMessage(message);
		}
	}
}