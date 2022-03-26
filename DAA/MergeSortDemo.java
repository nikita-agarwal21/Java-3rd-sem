package DAA;

import java.util.ArrayList;
import java.util.Random;

public class MergeSortDemo {
	public static void main(String args[])
	{
		ArrayList<Long>graphData=new ArrayList<Long>();
		ArrayList<Integer>inputData=new ArrayList<Integer>();
		for(int i=5000;i<=50000;i+=5000)
		{
			Random r=new Random();
			int arr1[]=new int[i];
			for(int j=0;j<i;j++)
				arr1[j]=r.nextInt()/100000000;
			long startTime=System.nanoTime();
			MergeSort m=new MergeSort();
			m.sort(arr1,0,(i-1));
			long stopTime=System.nanoTime();
			long elapseTime=(stopTime-startTime);
			System.out.println("time taken by merge sort array with sixe"+i+"is:"+elapseTime);
			graphData.add(elapseTime);
			inputData.add(i);
		}
		System.out.println("the data to be plotted for merge sort:");
		System.out.println("Input data elapse time(millisec):");
		for(int i=0;i<graphData.size();i++)
	     System.out.println(inputData.get(i)+"\t\t"+(float)graphData.get(i)/1000000);
	}

}
