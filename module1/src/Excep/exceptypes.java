package Excep;

import java.sql.SQLException;

class exceptypes  {
	public static void main(String args[]) {
		int[] ar = new int[3];
		//System.out.println(10/0);
		throw new SQLException();
	}
}
 class child {
	 int x;
	 void m1() {
		 System.out.println("hi");
	 }
 }
