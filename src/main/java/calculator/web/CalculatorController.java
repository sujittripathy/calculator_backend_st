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
		int sum = req.getI() + req.getJ();
		CalculatorResponse res = new CalculatorResponse(sum);
		return res;
	}

	@RequestMapping(value = "/sub",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public CalculatorResponse sub(@RequestBody CalculatorRequest req) {
		int sub = req.getI() - req.getJ();
		CalculatorResponse res = new CalculatorResponse(sub);
		return res;
	}
	
	@RequestMapping(value = "/mul",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public CalculatorResponse mul(@RequestBody CalculatorRequest req) {
		int mulResult = req.getI() * req.getJ();
		CalculatorResponse res = new CalculatorResponse(mulResult);
		return res;
	}
	
	@RequestMapping(value = "/div",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public CalculatorResponse div(@RequestBody CalculatorRequest req) {
		int divResult = req.getI() / req.getJ();
		CalculatorResponse res = new CalculatorResponse(divResult);
		return res;
	}
	
	@RequestMapping(value = "/sample",
					method = RequestMethod.GET,
					consumes = MediaType.APPLICATION_JSON_VALUE
			)
	public CalculatorResponse getSample(){
		CalculatorResponse cr = new CalculatorResponse(100);
		return cr;
	}
	
}
