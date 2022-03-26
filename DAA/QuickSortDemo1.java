package DAA;

import java.util.ArrayList;
import java.util.Random;

public class QuickSortDemo1
{
 public static void main(String args[])
	{
			
			ArrayList<Long>graphData=new ArrayList<Long>();
			ArrayList<Integer>inputData=new ArrayList<Integer>();int x;
			for(int i=5000;i<=50000;i+=5000)
			{
				Random r=new Random();
				int arr1[]=new int[i];
				for(int j=0;j<i;j++)
				{
					x=r.nextInt();
					arr1[j]=x/10000000;
				}
				long startTime=System.nanoTime();
				QuickSort qs=new QuickSort();
				qs.sort(arr1,0,(i-1));
				long stopTime=System.nanoTime();
				long elapseTime=(stopTime-startTime);
				System.out.println("time taken by quick sort array with sixe"+i+"is:"+elapseTime);
				graphData.add(elapseTime);
				inputData.add(i);
			}
			System.out.println("the data to be plotted for quick sort:");
			System.out.println("Input data elapse time(millisec):");
			for(int i=0;i<graphData.size();i++)
		     System.out.println(inputData.get(i)+"\t\t"+(float)graphData.get(i)/1000000);
		}

	}

