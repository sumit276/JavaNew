import java.sql.*;

public class CreateExample {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/retail","root","root");
		Statement st = con.createStatement();
		st.execute("create table emp(eid int, ename varchar(10))");
		System.out.println("Table is created");		
	}

}
