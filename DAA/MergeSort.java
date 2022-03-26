package DAA;

public class MergeSort
{
static int max=1000000;
void merge(int[] a,int low,int mid,int high)
{
int[] resarray;
int i=low;int j=mid+1;int k=low;
resarray=new int[max];
while(i<=mid&&j<=high)
{
	if (a[i]<a[j])
	{
		resarray[k]=a[i];
		i++;
		k++;
	}
	else
	{
		resarray[k]=a[j];
	    j++;
	    k++;
	}
}

while(i<=mid)
{
	resarray[k]=a[i];
	k++;i++;
}
while(j<=high)
{
	resarray[k]=a[j];
	k++;j++;
}
for(int m=0;m<=high;m++)
{
	a[m]=resarray[m];
}

}


void sort(int[] a,int low,int high)
{
	if(low<high)
	{
		int mid=(low+high)/2;
		sort(a,low,mid);
		sort(a,mid+1,high);
		merge(a,low,mid,high);
	}

}
}
