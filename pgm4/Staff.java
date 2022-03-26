package pgm4;

public class Staff {
	protected int staffId;
	protected String name;
	protected String phoneNumber;
	protected int salary;
	public Staff(int staffId, String name, String phoneNumber, int salary) 
	{
		super();
		this.staffId = staffId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
