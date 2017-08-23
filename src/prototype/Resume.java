package prototype;

public class Resume implements Cloneable
{
	private String name;
	private String sex;
	private String age;
	private WorkExperience workExperience;
	
	public Resume(String name)
	{
		this.name = name;
		this.workExperience = new WorkExperience();
	}
	
	public void setPersonaInfo(String sex, String age)
	{
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String workDate, String company)
	{
		workExperience.setWorkDate(workDate);
		workExperience.setCompany(company);
	}
	
	@Override
	public String toString() 
	{
		return name + " " + sex + " " + age + "\n" + "Work Experience: " + workExperience.getWorkDate() + " " + workExperience.getCompany();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Resume r = (Resume) super.clone();
		WorkExperience work = (WorkExperience) workExperience.clone();
		r.workExperience = work;
		
		return r;
	}
}