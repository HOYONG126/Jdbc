package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataApp {
	public static void main(String[] args) throws SQLException{
		Connection con=ConnectionFactory.getConnection();
		Statement stmt=con.createStatement();
		
		String sql="SELECT * FROM STUDENT ORDER BY NO";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("EMPNO"));
		}
		System.out.println("====================================");
		//ResultSetMetaData rsmd=rs.getMetaData();
		//ResultSetMetaData 객체를 반환하는 메소드
		System.out.println("====================================");
		ConnectionFactory.close(con, stmt, rs);
		
}
}
