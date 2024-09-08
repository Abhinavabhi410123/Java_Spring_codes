
class Carray {
	public static void main(String[] args) 
	{
		Delements d = new Delements();
		int a[] = {100,200,130,30,50,100,200};
		int b[]=new int[a.length];
		//int count=1,count1=0;
		d.duplicate(a,1,b,0);
	}
}
class Delements{
	void duplicate(int[] a,int count,int[] b,int count1) {
		for(int i=0;i<a.length;i++) {
			if(b[i]>=1)
				continue;
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=count;	
				}
			}
		}
		for(int m=0;m<b.length;m++) {
			if(b[m]>1)
			{
				count1++;
			}
		}
	if(count1>0) {
		int max=Integer.MIN_VALUE;
		for(int k=0;k<b.length;k++) {
			if(max<b[k])
				max = b[k];
		}

		//System.out.println(max);
		for(int l=0;l<b.length;l++) {
			if(b[l]==max) {
				System.out.println("max duplicate element is: "+a[l]+" frequency is "+max);
			}
		}
	}
	else {
		int min =Integer.MAX_VALUE;
		for(int k=0;k<a.length;k++) {
			if(min>a[k])
				min = a[k];
		}
		System.out.println("min unique element is: "+min);
	}

}}




