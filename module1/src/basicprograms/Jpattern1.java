package basicprograms;

public class Jpattern1 {
	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=2*rows-i;k>=i;k-- ) {
				if(k==i||i==1||k==2*rows-i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}