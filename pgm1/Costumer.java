package pgm1;

import java.util.StringTokenizer;

public class Costumer {
	private String name;
private String dateOfBirth;
public Costumer(String name, String dateOfBirth) {
	
	this.name = name;
	this.dateOfBirth = dateOfBirth;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth)
{
	this.dateOfBirth = dateOfBirth;
}

@Override
public String toString()
{
StringTokenizer st=new StringTokenizer(dateOfBirth,"/");
String s=name;
while(st.hasMoreElements())
	s=s+","+st.nextToken();
return s;

}
}



