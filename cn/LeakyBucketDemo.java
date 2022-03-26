package cn;

import java.util.Scanner;

public class LeakyBucketDemo {
	public static void main(String[] args)
	{
		int nsec,capacity,i,processRate;
		int inpPArray[] = new int[25];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The Bucket Size\n");
		capacity = scanner.nextInt();
		System.out.print("Enter The Processing Rate\n"); 
		processRate = scanner.nextInt(); 
		System.out.print("Enter The No. Of Seconds You Want To Simulate\n"); 
		nsec = scanner.nextInt();
		for(i=0;i<nsec;i++) 
		{
		System.out.print(" Enter The Size Of The Packet Entering At " + (i+1) + " sec\n"); 
		inpPArray[i] =  scanner.nextInt();
		}
		LeakyBucket leakyBucket = new LeakyBucket(capacity,processRate);
		leakyBucket.simulateLeakyBucket(inpPArray, nsec);
		scanner.close();
		}
}
