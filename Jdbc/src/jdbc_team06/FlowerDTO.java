package jdbc_team06;
public class FlowerDTO {
	private int no;
	private String name;
	private String season;
	
	public FlowerDTO() {
	}
	public FlowerDTO(int no, String name, String season) {
		super();
		this.no = no;
		this.name = name;
		this.season = season;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	@Override
	public String toString() {
		return "번호 : "+no+"  이름 : "+name+" 개화시기 : "+season;
	}
}
