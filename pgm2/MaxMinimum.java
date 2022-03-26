package pgm2;

public class MaxMinimum {
public static int big(int a[],int n)
{
int max = 0;
a[0]=max;
for(int i=0;i<=n-1;i++)
{if (a[i]>max)
	max=a[i];
}

return max;

public static int small(int a[],int n)
{
	int min;
	a[0]=min;
	for(int i=0;i<=n-1;i++)
	{

		if(a[i]<min)
			min=a[i];
	}
	return min;
	
}

}
}
