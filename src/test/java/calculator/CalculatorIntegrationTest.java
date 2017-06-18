package calculator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import calculator.config.RootConfig;
import calculator.config.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
	@ContextConfiguration(classes = {RootConfig.class}),
	@ContextConfiguration(classes = {WebConfig.class})
})
public class CalculatorIntegrationTest {
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	@Ignore
	public void testSample() throws Exception {
		this.mockMvc.perform(get("/sample")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("{\"result\":100}"));
	}
	
	@Test
	public void testAdd() throws Exception {
		this.mockMvc.perform(post("/add")
				.content("{\"i\":100,\"j\":20}")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("{\"result\":120}"));
	}
	
	@Test
	public void testSub() throws Exception {
		this.mockMvc.perform(post("/sub")
				.content("{\"i\":100,\"j\":20}")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("{\"result\":80}"));
	}
	
}
