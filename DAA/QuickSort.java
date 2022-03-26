package DAA;

public class QuickSort 
{
static int max=50000;
int partition(int[]a,int low,int high)
{
	int p,i,j,temp;
	p=a[low];
	i=low+1;
	j=high;
	while(low<high)
	{
		while(a[i]<=p&&i<high)
			i++;
		while(a[j]>p)
			j--;
		if(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		else
		{
			temp=a[low];
			a[low]=a[j];
			a[j]=temp;
			return j;
		}
	}
	return j;
}



void sort(int[] a,int low,int high)
{
if (low<high)
{
int s=partition(a,low,high);
sort(a,low,s-1);
sort(a,s+1,high);
}
}

}
