package com.example.NounService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		properties = {"spring.cloud.consul.enabled=false",
				"words=\"a,b,c\""})
public class NounServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
