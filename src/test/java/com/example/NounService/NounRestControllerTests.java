package com.example.NounService;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"spring.cloud.consul.enabled=false",
                "words=\"a,b,c\""})
public class NounRestControllerTests {
    @Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	/**
	 * Called before each test.
	 */
	@Before
	public void setUp() {
		//this.context.getBean(MetricsEndpoint.class).   .setEnabled(true);
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

    /**
     * Test '/' words.
     *
     * @throws Exception On failure.
     */
	@Test
	public void home()
			throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
