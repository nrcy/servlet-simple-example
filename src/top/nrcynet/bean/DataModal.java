package top.nrcynet.bean;

public class DataModal {

	private String str01;
	
	private String str02;

	public String getStr01() {
		return str01;
	}

	public void setStr01(String str01) {
		this.str01 = str01;
	}

	public String getStr02() {
		return str02;
	}

	public void setStr02(String str02) {
		this.str02 = str02;
	}
	
	@Override
	public String toString() {
		return "{\"str01\":\"" + str01 + 
				"\",\"str02\":\"" + str02 + "\"}";
	}
	
}
