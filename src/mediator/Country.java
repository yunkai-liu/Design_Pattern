package mediator;

public abstract class Country
{
	private UnitedNation unitedNation;
	
	public Country(UnitedNation unitedNation)
	{
		this.unitedNation = unitedNation;
	}
	
	public abstract void declare(String message);
	public abstract void getMessage(String message);

	public UnitedNation getUnitedNation() 
	{
		return unitedNation;
	}

	public void setUnitedNation(UnitedNation unitedNation) 
	{
		this.unitedNation = unitedNation;
	}
}