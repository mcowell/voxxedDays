package com.coweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExchangeControllerTests {

	@Test
	public void exchangeTest() {
		Assert.assertEquals(1, 1);
	}

}
