package Stringprobs;

public class Smostrepeated {

	public static void main(String[] args) {
		String s = "abcabcaba";
		char c[]=s.toCharArray();
		int count=0,max=Integer.MIN_VALUE;
		int a[] = new int[c.length];
		//System.out.println(a.length);
		for(int i=0;i<c.length;i++) {
			count=1;
			if(a[i]<1) {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						a[j]=1;
						count++;
						a[i]=count;
					}
					if(max<a[i])
						max=a[i];
				}
					
			}
		}
		for(int y=0;y<a.length;y++) {
			if(max==a[y])
			System.out.print(c[y]);
	}
	}

}
