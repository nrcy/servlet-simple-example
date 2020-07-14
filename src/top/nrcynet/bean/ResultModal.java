package top.nrcynet.bean;

public class ResultModal {

	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString () {
		return "{\"result\":\"" + result + "\"}";
	}
	
}
