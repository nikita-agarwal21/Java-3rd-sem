package assignment;
import java.io.*; 
class fifo{
	
	public static void main(String args[]) throws Exception 
	{ 
	int n,AT[],BT[],WT[],TAT[]; 
	float AWT=0;
	float ATAT=0;
	InputStreamReader isr=new InputStreamReader(System.in); 
	BufferedReader br=new BufferedReader(isr); 
	System.out.println("Enter no of process"); 
	n=Integer.parseInt(br.readLine()); 
	BT=new int[n]; 
	WT=new int[n]; 
	TAT=new int[n]; 
	AT=new int[n];  
	for(int i=0;i<n;i++) 
	{ 
	System.out.println("Enter burst time for process "+(i+1)); 
	BT[i]=Integer.parseInt(br.readLine()); 
	} 
	for(int i=0;i<n;i++) 
	{ 
	System.out.println("Enter arrival time for process"+(i+1)); 
	AT[i]=Integer.parseInt(br.readLine()); 
	} 

	WT[0]=0;
	for(int i=1;i<n;i++) 
	{ 
	WT[i]=WT[i-1]+BT[i-1]+AT[i-1]; 
	WT[i]=WT[i]-AT[i]; 
	} 
	for(int i=0;i<n;i++)
	{ 
	TAT[i]=WT[i]+BT[i]; 
	AWT=AWT+WT[i]; 
	} 
	System.out.printf(" PROCESS\tArival Time\t Burst Time\tWaiting Time\tTurn Around Time"); 
	for(int i=0;i<n;i++) 
	{
		System.out.println("");
	System.out.printf("\t"+i+ "\t"+AT[i]+"\t\t"+BT[i]+"\t\t"+WT[i]+"\t\t"+TAT[i]);
	} 
	AWT=AWT/n; 
	System.out.println("");
	System.out.println("Avg waiting time="+AWT+"\n");

	for(int i=0;i<n;i++) 
	{ 
	TAT[i]=WT[i]+BT[i]; 
	ATAT=ATAT+TAT[i]; 
	}

	ATAT=ATAT/n; 
	 
	System.out.println("Avg turn around time="+ATAT+"\n"); 
	}
	}

