package jdbc_team06;

public class SeasonDTO {
	private String season;
	private String feature;
	private int temperature;
	
	public SeasonDTO() {
	}

	public SeasonDTO(String season, String feature, int temperature) {
		super();
		this.season = season;
		this.feature = feature;
		this.temperature = temperature;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "계절 : "+season+"   특징 : "+ feature+"  평균온도:"+temperature;
	}
}
