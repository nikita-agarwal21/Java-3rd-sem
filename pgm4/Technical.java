package pgm4;

public class Technical extends Staff
{
	private String skills;

	public Technical(int staffId, String name, String phoneNumber, int salary, String skills) {
		super(staffId, name, phoneNumber, salary);
		this.skills = skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getSkills() {
		return skills;
	}

	
	@ Override
	public String toString()
	{
		String s=" ";
	System.out.printf("%d \t %s \t %s \t %d \t %s \n",staffId,name,phoneNumber,salary,skills);
	return s;
		}
}
