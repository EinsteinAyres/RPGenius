package com.qu4rx.RPGenius;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RpGeniusApplicationTests {

	@Test
	void contextLoads() {
	}

}
