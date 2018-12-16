package classes;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectJDBC {

	

 
		
		public static Connection getConnection() throws Exception	{
		
			DriverManager.setLogWriter(new PrintWriter(System.out));
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = null;
			String user = null;
			String password = null;
			try{
				  Properties properties = new Properties();
			
				  FileInputStream fichierTemporaire = new FileInputStream("src/main/resources/connect.properties");
				  properties.load(fichierTemporaire);
				  url = properties.getProperty("url");
				  user = properties.getProperty("user");
				  password = properties.getProperty("password");
				}catch( Exception e){
				 System.out.println("File not found");
				}
		

			return DriverManager.getConnection(url, user, password);
		
	}
}
