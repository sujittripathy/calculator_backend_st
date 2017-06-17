package calculator.dto;

public class CalculatorResponse {

	private int result;
	public CalculatorResponse(){
		
	}
	public CalculatorResponse(int sum) {
		this.result = sum;
	}
	public int getResult() {
		return result;
	}
	
}
