package calculator.dto;

public class CalculatorRequest {

	private int i;
	private int j;
	
	public CalculatorRequest(){
		
	}
	public CalculatorRequest(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	

}
