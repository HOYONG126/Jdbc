package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactoryApp {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//여기 메소드에 묶인 것들은 파일불러오기 , 연결하기 +연결할 때 필요한 url, user, password
			con=ConnectionFactory.getConnection();
			
			
			stmt=con.createStatement();
			
			String sql="SELECT DEPTNO,DNAME,LOC FROM DEPT ORDER BY DEPTNO";
			rs=stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				System.out.println("사원번호 : "+ rs.getInt("DEPTNO")+"사원번호 : "+ rs.getString("DNAME")+
						"위치 : "+ rs.getString("LOC"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(con, stmt,rs);
		}
		
}
}
