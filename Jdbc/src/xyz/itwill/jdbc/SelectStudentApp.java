package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudentApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("Object.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			
			con = DriverManager.getConnection(url,user,password);
			
			stmt=con.createStatement();
			String sql="select * from student order by no";
			
			rs=stmt.executeQuery(sql);
			
			//ResultSet 객체에 저장된 모든 검색행을 행단위로 처리하기 위해 ResultSet 객체는 내부적인 커서 제공
			//=>Resultset 커서는 최초 resultSet 객체의 BOF(Before Of File) 영역에 위치
			//ResultSet.next() : ResultSet 커서를 다음행으로 이동하는 메소드
			// => false 반환 : ResultSet 커서 위치에 처리행이 없는 경우의 반환값 - EOF() 영역에 위치
			// => true 반환:
			if(rs.next()) {
				System.out.println("[메세지] 검색된 학생정보가 있습니다.");
				
				
				do {
					//ResultSet 커서가 위치한 처리행의 컬럼값을 하나씩 반환받아 저장
					//ResultSet.getXXX(int columnIndex) 또는 ResultSet.getXXX(String columnLabel)
					//=>ResultSet 커서가 위치한 처리행의 컬럼값을 반환하는 메소드
					//=>XXX는 컬럼값으 반환받기 위한 JAVA 자료형을 표현
					//=>columnIndex : 검색행에서 검색대상의 순서를 차례대로 1부터 1씩 증가되는 정수값으로 표현
					//int no=rs.getInt(1);
					int no=rs.getInt("no");
					String name=rs.getString("name");
					String phone=rs.getString("phone");
					String address=rs.getString("address");
					Date birthday=rs.getDate("birthday");
					
					System.out.println("학번 ="+no);
					System.out.println("폰번호 ="+phone);
					System.out.println("주소 ="+address);
					System.out.println("생일 ="+birthday);
					System.out.println("=======================================================");
				}while(rs.next());
			}else {
				System.out.println("[메시지] 학생정보 모두 출력되었습니다.");
			}
			
			
		}catch (ClassNotFoundException e) {
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs!=null)
						rs.close();
					if(stmt!=null) stmt.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
