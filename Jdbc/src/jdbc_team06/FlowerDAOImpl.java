package jdbc_team06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.proxy.annotation.Pre;
import xyz.itwill.student.StudentDAOImpl;

public class FlowerDAOImpl extends JdbcDAO implements FlowerDAO {

	private static FlowerDAOImpl _DAO;
	static {
		_DAO=new FlowerDAOImpl();
	}
	public static FlowerDAOImpl getDAO() {
		return _DAO;
	}
	public FlowerDAOImpl() {
	}
	
	@Override
	public int insertFlower(FlowerDTO dto) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int str=0;
		try{
			con=getConnection();
		String sql="INSERT INTO FLOWER VALUES(?,?,?)";
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, dto.getNo());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getSeason());
		str= pstmt.executeUpdate();
		System.out.println(str+"개의 정보가 꽃 테이블에 삽입됐습니다.");
		
		return str;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		
		
		
		return 0;
	}

	@Override
	public int updateFlower(FlowerDTO dto) {
		Connection con=null;
		PreparedStatement pstmt=null;
		con=getConnection();
		String stl="";
		pstmt=con.prepareStatement(stl);
		
		int str=pstmt.executeUpdate();
		
		return 0;
	}

	@Override
	public int deleteFlower(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FlowerDTO selectFlower(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertSeason(SeasonDTO season) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSeason(SeasonDTO season) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSeason(String season) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SeasonDTO selectSeason(String season) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
