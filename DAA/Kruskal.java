package DAA;

public class Kruskal {
	int parent[]=new int[10];
	int find(int m)
	{
		int p=m;
		while(parent[p]!=0)
			p=parent[p];
		return p;
	}
	void union(int i,int j)
	{
		if(i<j)
			parent[i]=j;
	}
	void krkl(int[][] a,int n)
	{
		int u=0,v=0,min,k=0,i,j,sum=0;
		while(k<n-1)
		{
			min=999;
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
					if(a[i][j]<min && i!=j)
					{
						min=a[i][j];
						u=i;
						v=j;
					}
		
			i=find(u);
			j=find(v);
			
			if(i!=j)
			{	
				
				union(i,j);
				System.out.println("("+u+","+v+")"+"="+a[u][v]);
				sum=sum+a[u][v];
				k++;
			}
			a[u][v]=a[v][u]=999;
			}
	System.out.println("the cost of parent=");
	System.out.print("[");
	for(i=1;i<=n;i++)
		System.out.print(parent[i]+" " );
	System.out.println("]");
	System.out.println("the cost of min spnning tree= "+sum);
	}
}
