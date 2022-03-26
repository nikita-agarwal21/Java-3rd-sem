package DAA;

public class Prims {
	int parent[]=new int[10];
	private int n;
	private int graph[][];
	public Prims(int n,int [][] graph)
	{
		super();
		this.n=n;
		this.graph=graph;
	}
	private int minkey(int key[],boolean mstSet[])
	{
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<n;v++)
			if(mstSet[v]==false && key[v]<min)
			{
				min=key[v];
				min_index=v;
			}
		return min_index;
	}
	public void primMST()
	{
		int key[]=new int[n];
		boolean mstSet[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			key[i]=Integer.MAX_VALUE;
			mstSet[i]=false;
		}
		key[0]=0;
		
		 parent[0]=-1;
		for(int count=0;count<n-1;count++)
		{
			int u=minkey(key,mstSet);
			mstSet[u]=true;
			for(int v=0;v<n;v++)
				if(graph[u][v]!=0 && mstSet[v]==false && graph[u][v]<key[v])
				{
					parent[v]=u;
					key[v]=graph[u][v];
				}
		}
	}
@Override
public String toString()
{
	String returnvalue=" ";
	for(int i=1;i<n;i++)
		returnvalue=returnvalue+parent[i]+"-"+i+" "+graph[i][parent[i]]+'\n';
	return returnvalue;
	}	
}
