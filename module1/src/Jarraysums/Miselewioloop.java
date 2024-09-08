package Jarraysums;

public class Miselewioloop {

	public static void main(String[] args) 
		
	{
		int arr[] = {3,1,2,4,8,10,9,12,13,14};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{		
			int min1=min;
			for(int j=0;j<arr.length;j++)
			{
				count++;
				if(arr[j]==min)
				{
					min+=1;
					continue;
				}
			}
			if(min1==min) {
				count++;
				if(min<max) {
				System.out.println(min+" missing value");
				min+=1;
				}
				else
					break;
			}
		}
		System.out.println(count+" count");
	}

}
