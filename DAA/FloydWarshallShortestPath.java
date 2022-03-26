package DAA;

public class FloydWarshallShortestPath 
{
	private int matrix[][];
	private int numOfVertices;
	public static final int INFINITY=999;
	public FloydWarshallShortestPath(int numOfVertices)
	{
		matrix=new int[numOfVertices+1][numOfVertices+1];
		this.numOfVertices=numOfVertices;
	}
	public void floydwarshall(int graph[][])
	{
		for(int i=0;i<numOfVertices;i++)
		{
			for(int j=0;j<numOfVertices;j++)
			{
				matrix[i][j]=graph[i][j];
			}
		}
		for(int k=0;k<numOfVertices;k++)
		{
			for(int i=0;i<numOfVertices;i++)
			{
				for(int j=0;j<numOfVertices;j++)
				{
					if(matrix[i][k]+matrix[k][j]<matrix[i][j])
						matrix[i][j]=matrix[i][k]+matrix[k][j];
				}
			}	
		}
		for(int i=0;i<numOfVertices;i++)
		{
			for(int j=0;j<numOfVertices;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
