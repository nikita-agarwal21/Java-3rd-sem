package DAA;

public class DyanamicKnapsack {
	private int n ;
	private int wt[];
	private int val[];
	private int m;
	private int selected[];
	public DyanamicKnapsack(int n,int[] wt,int[] val,int m) {
		super();
		this.n = n;
		this.wt = wt;
		this.val = val;
		this.m = m;
	}
	public void process()
	{
		int NEGATIVE_INFINITY =Integer.MIN_VALUE;
		int[][] max=new int[n+1][m+1];
		int[][] sol=new int [n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				int m1=max[i-1][j];
				int m2=NEGATIVE_INFINITY;
				if(j>=wt[i])
				m2=max[i-1][j-wt[i]]+val[i];
				max[i][j]=Math.max(m1, m2);
				System.out.print(max[i][j]+" ");
				sol[i][j]=m2>m1?1:0;
			}
			System.out.println("");
		}
		selected=new int[n+1];
		for(int k=n,w=m;k>0;k--)
		{
			if(sol[k][w]!=0)
			{
				selected[k]=1;
				w=w-wt[k];
			}
			else
				selected[k]=0;
		}
		System.out.print("[");
		for(int k=1;k<=n;k++)
			System.out.print(selected[k]+" ");
		System.out.print("]");
	}
}
