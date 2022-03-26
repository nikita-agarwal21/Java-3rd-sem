package DAA;

public class TSP 
{
	private int n;
	int[]tour=new int[100];
	private int weight[][];
	final int INF=1000;
	int finalCost;
	public TSP(int n, int[][] weight) 
	{
		super();
		this.n = n;
		
		this.weight = weight;
	}
	public int COST(int currentNode,int inputSet[],int setSize)
	{
		if (setSize==0)
			return weight[currentNode][0];
		int min=INF;
		int setToBePassedOnToNextCallOfCost[]=new int[n-1];//if i nd k are same pass it
		for(int i=0;i<setSize;i++)
		{
			int k=0;
					for(int j=0;j<setSize;j++)
					{
						if(inputSet[i]!=inputSet[j])
							setToBePassedOnToNextCallOfCost[k++]=inputSet[j];
					}
					int temp=COST(inputSet[i],setToBePassedOnToNextCallOfCost,setSize-1);
					
					if((weight[currentNode][inputSet[i]]+temp)<min)
					{
						min=weight[currentNode][inputSet[i]]+temp;
						
					}
		}
		return min;
	}
	public int MIN(int currentNode,int inputSet[],int setSize)
		{
			if (setSize==0)
				return weight[currentNode][0];
			int min=INF,minIndex=0;
			int setToBePassedOnToNextCallOfCost[]=new int[n-1];
			for(int i=0;i<setSize;i++)//considers each node of inputset
			{
				int k=0;
						for(int j=0;j<setSize;j++)
						{
							if(inputSet[i]!=inputSet[j])
								setToBePassedOnToNextCallOfCost[k++]=inputSet[j];
						}
						int temp=COST(inputSet[i],setToBePassedOnToNextCallOfCost,setSize-1);
					
						if((weight[currentNode][inputSet[i]]+temp)<min)
						{
							
							minIndex=inputSet[i];
						}
			}
			return minIndex;
		}
			public void eval(int n,int[][]weight)
			{
				int dummySet[]=new int[n-1];
				for(int i=1;i<n;i++)
					dummySet[i-1]=i;
				finalCost=COST(0,dummySet,n-1);
				constructTour();
			}
			public void constructTour() {
				int previousSet[]=new int[n-1];
				int nextSet[]=new int[n-2];
				for(int i=1;i<n;i++)
					previousSet[i-1]=i;
				int setSize=n-1;
				tour[0]=MIN(0,previousSet,setSize);//first element of d tour from source
				for(int i=1;i<n-1;i++)
				{
					int k=0;
					for(int j=0;j<setSize;j++)
					{
						if (tour[i-1]!=previousSet[j])
							nextSet[k++]=previousSet[j];
					}
					--setSize;
					tour[i]=MIN(tour[i-1],nextSet,setSize);
					for(int j=0;j<setSize;j++)
						previousSet[j]=nextSet[j];
				}
				display();
			}
			public void display()
			{
				System.out.println();
				System.out.print("the tour is 1-");
				for(int i=0;i<n-1;i++)
					System.out.print((tour[i]+1)+"-");
				System.out.print("1\n");
				System.out.println("the final cost is "+finalCost);
			}
	}


