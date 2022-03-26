package cn;

public class LeakyBucket {
	private int capacity;
	private int processRate;
	public  LeakyBucket(int cap, int pr) {
	capacity = cap;
	processRate = pr;
	}
	
	public void simulateLeakyBucket(int[] inputPacketArray, int nSec) {
	int i, drop=0, count=0, mini;
	System.out.print(" \nSecond  | Packet Received | Packet Sent | Packet Left | Packet Dropped \n"); 
	for(i=0;i<nSec;i++)
	{ 
	count+=inputPacketArray[i]; 
	if(count>capacity)
	{
	drop = count - capacity;
	count=capacity;
	}
	System.out.print(i+1);
	System.out.print("\t\t" + inputPacketArray[i]);
	mini=min(count,processRate);
	System.out.print("\t\t" + mini);
	count = count - mini;
	System.out.print("\t\t" + count);
	System.out.print("\t\t" + drop + "\n");
	drop=0;
	}
	for(;count!=0;i++)
	{
	if(count>capacity)
	{
	drop = count - capacity;
	count=capacity;
	}
	System.out.print(i+1);
	System.out.print("\t\t0");
	mini=min(count,processRate);
	System.out.print("\t\t" + mini);
	count = count - mini;
	System.out.print("\t\t" + count);
	System.out.print("\t\t" + drop + "\n");
	}
	}
	private static int min(int x,int y) 
	{
	if(x<y) 
	return x;
	else 
	return y;
	}
	
}
