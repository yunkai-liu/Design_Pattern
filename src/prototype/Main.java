package prototype;

public class Main 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Resume r = new Resume("Alice");
		r.setPersonaInfo("Miss", "18");
		r.setWorkExperience("2016-2017", "Facebook");
		
		Resume r1 = (Resume) r.clone();
		r1.setPersonaInfo("Miss", "18");
		r1.setWorkExperience("2016-2018", "Amazon");
		
		Resume r2 = (Resume) r.clone();
		r2.setPersonaInfo("Miss", "16");
		r2.setWorkExperience("2016-2020", "Google");
		
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
	}
}