package DAA;

public class GreedyKnapsack {
	private int n;
	private int m;
	private int [][] arr;
	public GreedyKnapsack(int n,int m,int[][] arr)
	{
		this.n=n;
		this.m=m;
		this.arr=arr;
	}
	public void greedy()
	{
		float sum_profit=0,max,res[]=new float[n];
		int i,j=0,k;
		for(k=0;k<n;k++)
		res[k]=0;
		while(m>=0)
		{
			max=0;
			for(i=0;i<n;i++)
			{
				if(((float)arr[1][i])/(float)arr[0][i]>max)
				{
					max=((float)arr[1][i])/(float)arr[0][i];
					j=i;
				}
			}
			if(arr[0][j]>m)
			{
				float x=(float)m/arr[0][j];
				System.out.println("quantity of item number. "+(j+1)+"added is:"+(float)m/arr[0][j]);
				sum_profit+=m*max;
				m=-1;
				res[j]=x;
			}
			else
			{
				System.out.println("quantity of item number "+(j+1)+"added fully");
				m-=arr[0][j];
				sum_profit+=(float)arr[1][j];
				arr[1][j]=0;
				res[j]=1;
			}
		}
		System.out.println("the total profit is"+sum_profit);
		System.out.println("the objects added to knapsack are:");
		System.out.print("[");
		for(k=0;k<n;k++)
			System.out.print(res[k]+" ");
		System.out.print("]");
	}
}
