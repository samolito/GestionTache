package com.gestiontache.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Mysqlconnect {
	static Connection conn=null;
	
    public static Connection ConnectDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
              conn =DriverManager.getConnection("jdbc:mysql://localhost/dbgestionequipe", "root", "rootpasswordgiven");
            return conn;
            
        }
        catch (ClassNotFoundException | SQLException e) 
        {
        	System.out.print(e.getMessage());
        }return null;
    }
}
