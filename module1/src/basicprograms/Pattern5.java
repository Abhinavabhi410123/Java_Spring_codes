package basicprograms;

public class Pattern5 {
public static void main(String[] args) {
	int rows=5;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=rows-i-1;k++) {
			System.out.print("* ");
		}
		for(int j=1;j<2*i-1;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=rows-i-1;k++) {
			if(k==1&&i==0)
				continue;
			else
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	}
}


