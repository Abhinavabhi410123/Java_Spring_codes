package basicprograms;
import java.util.Scanner;
public class Patterns1 {
	public static void main(String[] args) {
		System.out.println("Enter s number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("#");
           }
           System.out.println();
       }
       for(int i=1;i<=n-1;i++){
           for(int j=i;j<=n-1;j++){
               System.out.print("#");
           }
           System.out.println();
       }
    }
}
