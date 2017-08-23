package mediator;

public abstract class UnitedNation 
{
	private Country country1;
	private Country country2;
	
	public abstract void declare(String message, Country country);

	public Country getCountry1() 
	{
		return country1;
	}

	public void setCountry1(Country country1) 
	{
		this.country1 = country1;
	}

	public Country getCountry2() 
	{
		return country2;
	}

	public void setCountry2(Country country2) 
	{
		this.country2 = country2;
	}
}