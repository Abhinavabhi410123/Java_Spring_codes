package basicprograms;
import java.util.Scanner;
public class Patterns4 {
	public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("# "); 
            }
            System.out.println();
        }
    }
}
