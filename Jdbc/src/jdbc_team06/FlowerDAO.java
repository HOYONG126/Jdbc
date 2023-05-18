package jdbc_team06;

public interface FlowerDAO {
	//flower테이블
	
	int insertFlower(FlowerDTO dto);
	int updateFlower(FlowerDTO dto);
	int  deleteFlower(int no);
	FlowerDTO selectFlower(int no);
	
	//season테이블
	int insertFlower(SeasonDTO season);
	int updateFlower(SeasonDTO season);
	int deleteFlower(String season);
	SeasonDTO selectFlower(String season);
	
}	
