package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//공통부분은 하나로 설정해서 관리하기
//Connection 객체를 생성하여 반환하서나 JDBC 관련 객체를 매개변수로 전달받아 제거하는 기능을 제공하는 클래스
public class ConnectionFactory {
	
	//Connection 객체를 생성하여 반환하는 메소드
	//연결부분을 메소드로 한 것 -> Oracle의 
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url,user,password);
		}catch (Exception e) {
			System.out.println("connection 객체 생성 중 오류 발생");
		}
		return con;
	}
	
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection con,Statement stmt) {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection con,Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
