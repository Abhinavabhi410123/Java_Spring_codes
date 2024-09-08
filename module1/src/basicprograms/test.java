package basicprograms;

public class test {

	
	public static void main(String args[]) {
	int a[]= {10,30,20,60,40,50};
	int temp=0;
	for(int i=0;i<a.length-1;i++) {
		if(i<a.length/2) {
			if(a[i]>a[i+1]) {
				temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
			else if(i>=a.length/2) {
				if(a[i]<a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					i=a.length/2-1;
				}
			}
	}
	for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
	}
	}
	
	}

