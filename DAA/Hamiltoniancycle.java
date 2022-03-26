package DAA;

public class Hamiltoniancycle 
{
	int flag=0;
	private int path[];
	private int n;
	private int sol_cnt=0;
	private int [][]graph;
	public Hamiltoniancycle(int n,int [][]graph)
	{
		this.n=n;
		this.graph=graph;
	}
private boolean isSafe(int v,int path[],int pos)//check if the vertex is an adjacent vertex of the previous added vertex
	{
		if(graph[path[pos-1]][v]==0)
			return false;
		for (int i=0;i<pos;i++)
			if(path[i]==v)
				return false;
		return true;
	}
private boolean hamCycleUtil(int path[],int pos)//if all the vertices are included in d hamiltonian cycle 
	{
		if(pos==n)
		{
			if(graph[path[pos-1]][path[0]]==1)
			{
				sol_cnt++;
				flag=0;
				printSolution();
			}
				path[pos-1]=-1;
				return false;
		}
		for(int v=1;v<n;v++)
		{
			if(isSafe(v,path,pos))//check if the vertex can be added to hamiltonian cycle
			{
				path[pos]=v;
				if(hamCycleUtil(path,pos+1)==true)
					return true;
				path[pos]=-1;//if adding that particular vertex doesnt leaded to sol then remove it
			}
		}
		return false;//if no vertex can be added to cycle constructed so far,]
		
	}
public int hamCycle()
	{
		path=new int[n];
		for(int i=0;i<n;i++)
			path[i]=-1;
		path[0]=0;
		if(hamCycleUtil(path,1)==false &&(sol_cnt==0))
		{
			flag=1;
			printSolution();
			return 0;
		}
		return 1;
	}
public void printSolution()
	{
	if(flag==1)
	{
		System.out.println("solution doesnot exists");
	}
	else
	{
		System.out.println(sol_cnt+"hamiltonian cycle:");
		for(int i=0;i<n;i++)
			System.out.print(" "+path[i]+" ");
		System.out.println(" "+path[0]+" ");
	}
}
}

