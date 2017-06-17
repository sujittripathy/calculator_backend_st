package calculator.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import calculator.dto.CalculatorRequest;
import calculator.dto.CalculatorResponse;

@RestController
public class CalculatorController {

	@RequestMapping(value = "/add",
					method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public CalculatorResponse add(@RequestBody CalculatorRequest req) {
		System.out.println("Value is:" + req.getI() +","+ req.getJ());

		int sum = req.getI() + req.getJ();
		CalculatorResponse res = new CalculatorResponse(sum);
		System.out.println("Sum is:" + res.getResult());
		return res;
	}
	
}
