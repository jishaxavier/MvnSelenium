package com.sel.jav.NewSelProj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlPractice {
	public static void main(String args[]) throws SQLException {
		
	
		System.setProperty("webdriver.chrome.driver","//Users//sandeep//eclipseJXworkspace//Driver//chromedriver");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//List<WebElement> ele = new ArrayList();
		String host = "127.0.0.1";
		String port = "3306";
		String dbName = "testdb";
		//URL="jdbc:mysql://localhost:3306/seleniumdb"
		String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
		System.out.println(url);
		ResultSet rs = null;
		Connection con = DriverManager.getConnection(url, "root", "jisha1234");
		if(con!=null) {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from student;");
			while(rs.next()) {
				for(int j=1;j<4;j++) {
					System.out.println(rs.getString(j));
				}
				
				//int count = rs.getInt("stud_count");
				//System.out.println("count is "+count);
			}
		}

	}
}
