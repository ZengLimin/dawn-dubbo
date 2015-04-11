package org.dawn.dubbo.consumer;

import org.dawn.dubbo.api.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/application*.xml" })
public class AppTest{
	@Autowired
	private App app;
	@Reference
	private HelloService helloService;
	@Test
	public void testName() throws Exception {
		app.sayHi();
		System.out.println(helloService.sayHi("Dawn"));
	}
}
