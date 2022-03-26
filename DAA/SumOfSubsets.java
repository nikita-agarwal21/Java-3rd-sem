package DAA;

public class SumOfSubsets
{
	private int count=0;
	private int []a;
	private int[]visited;
	private int desiredSum;
	private int totalSum;
	 public SumOfSubsets(int[] a,int[] visited,int desiredSum,int totalSum)
	 {
		 this .a=a;
		 this.visited=visited;
		 this.desiredSum=desiredSum;
		 this.totalSum=totalSum;
	 }
	 public void sumOfSubsets(int index,int curSum,int totalSum)
	 {
		 visited[index]=1;
		 if (a[index]+curSum==desiredSum)
		 {
			 System.out.println("solution"+(++count)+":");
			 for(int i=0;i<=index;i++)
			 {
				 if(visited[i]==1)
				 {
					 System.out.print(a[i]+" ");
				 }
			 }
			 System.out.println();
		 }
		 else if (index + 1<a.length && curSum +a[index]+a[index +1]<=desiredSum)
		 {
			 sumOfSubsets(index+1,curSum+a[index],totalSum-a[index]);
		 }
		 if(index+1<a.length && curSum+a[index+1]<=desiredSum && curSum +totalSum-a[index]>=desiredSum)
		 {
			 visited[index]=0;
			 sumOfSubsets(index+1,curSum,totalSum-a[index]);
		 }
		 if(count==0)
		 {
			 System.out.println("no solution");
			 System.exit(0);
		 }
	 }
}
