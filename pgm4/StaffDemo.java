package pgm4;

import java.util.Scanner;

public class StaffDemo
{
public static void main(String args[])
{
	int teachingCount=0,technicalCount=0,contractCount=0;
int staffId,salary,publication,period;String name,phoneNumber,domain,skills;
Scanner scanner = new Scanner(System.in);
	Teaching teaching=null;
	Contract contract=null;
	Technical technical=null;
	
	Teaching[] teachings=new Teaching[10];
	Contract[] contracts=new Contract[10];
	Technical[] technicals=new Technical[10];
	int option=7;
	
	System.out.printf("1.enter the teaching details \n 2.display the teaching details \n 3.enter technical details \n 4.display the teachnical details \n 5.enter contract details \n 6.display contract details\n 7.exit\n"); 
	do {
		System.out.println("enter your opttion");
	option=scanner.nextInt();
	switch (option)
	{
	case 1:System.out.println("enter staffId,name,phoneNumber,salary,domain,publications");
	staffId=scanner.nextInt();
	name=scanner.next();
	phoneNumber=scanner.next();
	salary=scanner.nextInt();
	domain=scanner.next();
	publication=scanner.nextInt();
	teaching=new Teaching (staffId,name,phoneNumber,salary,domain,publication);
	teachings[teachingCount]=teaching;
	teachingCount+=1;
	break;
	
	case 2:
		try
		{
			if (teachingCount==0)
			{
				throw new StaffNotFoundException();
				
			}
		
		for(int i=0;i<teachingCount;i++)
		System.out.println(teachings[i]);
	
		}
		catch(StaffNotFoundException snfe)
		{
System.out.println("teaching staff not found\n");			
		}
		break;
	
	
	case 3:System.out.println("enter staffId,name,phoneNumber,salary,skills");
	staffId=scanner.nextInt();
	name=scanner.next();
	phoneNumber=scanner.next();
	salary=scanner.nextInt();
	skills=scanner.next();
	technical=new Technical(staffId,name,phoneNumber,salary,skills);
	technicals[technicalCount]=technical;
	technicalCount+=1;
	break;
	
	case 4:
		try
		{
			if (technicalCount==0)
			{
				throw new StaffNotFoundException();
				
			}
		
		
		
		for(int i=0;i<technicalCount;i++)
		System.out.println(technicals[i]);
	
		}
		
		catch(StaffNotFoundException snfe)
		{
System.out.println("technical staff not found\n");			
		}
		
		break;
	
	case 5:System.out.println("enter staffId,name,phoneNumber,salary,period");
	staffId=scanner.nextInt();
	name=scanner.next();
	phoneNumber=scanner.next();
	salary=scanner.nextInt();
	period=scanner.nextInt();
	contract=new Contract (staffId,name,phoneNumber,salary,period);
	contracts[contractCount]=contract;
	contractCount+=1;
	break;
	
	case 6:
		try
		{
			if (contractCount==0)
			{
				throw new StaffNotFoundException();
				
			}
		for(int i=0;i<contractCount;i++)
		System.out.println(contracts[i]);
	
		}
		catch(StaffNotFoundException snfe)
		{
System.out.println("contract staff not found\n");			
		}
		break;
	}
	}
	while(option !=7);
}
}

