package pgm4;

public class Teaching extends Staff 
{


private String domain;
private int publications;
public Teaching(int staffId, String name, String phoneNumber, int salary, String domain, int publications) {
	super(staffId, name, phoneNumber, salary);
	this.domain = domain;
	this.publications = publications;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public int getPublications() {
	return publications;
}
public void setPublications(int publications) {
	this.publications = publications;
}



@ Override
public String toString()
{
	String s=" ";
System.out.printf("%d\t %s\t %s\t %d\t %s\t %d\n",staffId,name,phoneNumber,salary,domain,publications);
return s;
	}
}
