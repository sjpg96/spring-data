package com.tutorialspoint.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionDB {
	public Connection c = null;
	public void ConfigConnection(){
		
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "postgres", "4411226111");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	}
	public void CreateT(){
		
	      Statement stmt = null;
	      try {
	       
	         stmt = c.createStatement();
	         String sql = "CREATE TABLE COMPANY " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " +
	            " AGE            INT     NOT NULL, " +
	            " ADDRESS        CHAR(50), " +
	            " SALARY         REAL)";
	         stmt.executeUpdate(sql);
	         stmt.close();
	        // c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
	}
	public void insertO(){
		  	  
		      Statement stmt = null;
		      try {
		        
		         stmt = c.createStatement();
		         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
		            + "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
		         stmt.executeUpdate(sql);

		         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
		            + "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
		         stmt.executeUpdate(sql);

		         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
		            + "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
		         stmt.executeUpdate(sql);

		         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
		            + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
		         stmt.executeUpdate(sql);

		         stmt.close();
		         //c.commit();
		         c.close();
		      } catch (Exception e) {
		         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		         System.exit(0);
		      }
		      System.out.println("Records created successfully");
	}

}
