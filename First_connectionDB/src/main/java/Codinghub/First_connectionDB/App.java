package Codinghub.First_connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	String url = "jdbc:mysql://localhost:3306/hello";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "root", "root");
        String q = "Insert into demo values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(q);
        pst.setInt(1,12);
        pst.setString(2,"sai");
        pst.setInt(3,13);
        
        System.out.println(pst.executeUpdate());
        String q1 = "Select * from demo";
        PreparedStatement pst1 = con.prepareStatement(q1);
        ResultSet r = pst1.executeQuery();
        while(r.next()) {
        	System.out.print(r.getInt(1)+"\t");
        	System.out.print(r.getString(2)+"\t");
        	System.out.print(r.getInt(3)+"\t");
        	System.out.println();
        }
        con.close();
        //ResultSet rs = pst.executeQuery("SELECT * FROM DEMO ;");
//        int drows = st.executeUpdate("Delete from DEMO where S_NO=10");
//        System.out.println(drows);
//        while(rs.next()) {
//        	System.out.print(rs.getInt(1)+"\t");
//        	System.out.print(rs.getString(2)+"\t");
//        	System.out.print(rs.getInt(3)+"\t");
//        	System.out.println();
//        }
//        int rows = st.executeUpdate("INSERT INTO DEMO VALUES(10,'ABHI',12);");
//        System.out.println(rows +" rows inserted");
//        con.close();
    }
}
