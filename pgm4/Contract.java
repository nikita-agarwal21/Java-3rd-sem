package pgm4;

public class Contract extends Staff
{
	private int period;

	public Contract(int staffId, String name, String phoneNumber, int salary, int period) {
		super(staffId, name, phoneNumber, salary);
		this.period = period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	
	public int getPeriod() {
		return period;
	}

	@ Override
	public String toString()
	{
		String s=" ";
	System.out.printf("%d \t %s \t %s \t %d \t  %d \n",staffId,name,phoneNumber,salary,period);
	return s;
		}	

}
