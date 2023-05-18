package jdbc_team06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

public class JdbcDAO {
	private static PoolDataSource pds;
	static {
		pds=PoolDataSourceFactory.getPoolDataSource();
		try {
			//PoolDataSource 객체에 Connection 객체를 미리 생성하여 저장
			pds.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
			pds.setURL("jdbc:oracle:thin:www.itwill.xyz:1521:xe");
			pds.setUser("jdbc_team06");
			pds.setPassword("jdbc_team06");
			pds.setInitialPoolSize(10);
			pds.setMaxPoolSize(15);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//PoolDataSource 객체(DBCP 객체)에 저장된 Connection 객체 중 하나를 반환하는 메소드
		public Connection getConnection() {
			Connection con=null;
			try {
				con=pds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
		
	
	
	public void close(Connection con, PreparedStatement pstmt) {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
			try {
				if(con!= null) con.close();
				if(pstmt!= null) pstmt.close();
				if(rs!= null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
}
