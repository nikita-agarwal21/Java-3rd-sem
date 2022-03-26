package DAA;

public class Dijkstra {
	private int n;
	private int graph[][];
	private int src;
	private int dist[];
	private int p[];
	private Boolean visited[];
	public Dijkstra (int graph[][],int src,int n)
	{
		this.src=src;
		this.graph=graph;
		this.n=n;
		dist=new int[10];
		p=new int[10];
		visited=new Boolean[10];
	}
	int minDistance(int dist[],Boolean visited[])
	{
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<n;v++)
			if(visited[v]==false&&dist[v]<=min)
			{
				min=dist[v];
				min_index=v;
			}
		return min_index;	
	}
	void process()
	{
		int u=-1,v,i;
		for(v=0;v<n;v++)
		{dist[v]=99;
		p[v]=-1;
		visited[v]=false;
				}
		
		dist[src]=0;
		for(i=0;i<n;i++)
		{
			u=minDistance(dist,visited);
			visited[u]=true;
			for(v=0;v<n;v++)
			{
				if((dist[u]+graph[u][v]<dist[v])&&(u!=v)&&visited[v]==false)
				{
					dist[v]=dist[u]+graph[u][v];
					p[v]=u;
				}
			}
			
		}
	}
	void path(int v,int s)
	{
		if(p[v]!=-1)
			path(p[v],s);
		if(v!=s)
			System.out.print("->"+v);
	}
	public void display()
	{
		System.out.println("the shortest path between source "+src+"to remaining vertices are");
		int i;
		for(i=0;i<n;i++)
		{
			if(i!=src)
			{
				System.out.print(src);
				path(i,src);
			}
			if(i!=src)
			
				System.out.println(" ="+dist[i]);
		
			
		}
			}
	}

