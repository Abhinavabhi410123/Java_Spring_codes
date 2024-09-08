package Excep;

import java.sql.SQLException;
import java.io.IOException;
public class throwvsthrows {

	public static void main(String[] args) throws IOException, SQLException {
		int a =20,b=20;
		if(a<b) {
			try {
			throw new ArithmeticException();
			}
			catch(ArithmeticException ae){
				System.out.println("ae");
			}
		}
		else if(a>b) {
			try {
			throw new SQLException();
			}
			catch(SQLException se){
				System.out.println("se");
			}
		}
		else {
			try {
			throw new IOException();
			}
			catch(IOException io) {
				System.out.println("ie");
			}
		}
	}
	

}
