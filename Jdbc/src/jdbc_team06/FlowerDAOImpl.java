package jdbc_team06;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlowerDAOImpl extends FlowerDTO implements FlowerDAO {

	private static FlowerDAOImpl _DAO;
	static {
		_DAO=new FlowerDAOImpl();
	}
	
	
	@Override
	public int insertFlower(FlowerDTO dto) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			con=getConnection();
		String sql="";
		pstmt=con.prepareStatement(sql);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return 0;
	}

	@Override
	public int updateFlower(FlowerDTO dto) {
		// TODO Auto-generated method stub
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
	public int insertFlower(SeasonDTO season) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateFlower(SeasonDTO season) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFlower(String season) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SeasonDTO selectFlower(String season) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
