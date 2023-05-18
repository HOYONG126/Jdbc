package xyx.itwill.teamproject;

public class OrderprogramDTO {
	
	private int no;
	private String foodName;
	private int price;
	public OrderprogramDTO() {
	}
	
	public OrderprogramDTO(int no, String foodName, int price) {
		super();
		this.no = no;
		this.foodName = foodName;
		this.price = price;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return no + "/t" + foodName +"/t/t"+price; 
	}
	
	
}
