package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.dto.CalculatorRequest;
import calculator.dto.CalculatorResponse;
import calculator.web.CalculatorController;

public class CalculatorTest {

	@Test
	public void add(){
		CalculatorController calc = new CalculatorController();
		CalculatorRequest req = new CalculatorRequest(110, 20);
		CalculatorResponse res = calc.add(req);
		int expected = req.getI() + req.getJ();
		assertEquals("Addition not matching", expected, res.getResult());
	}
	
	//@Test
	public void sub(){
		
	}
}
