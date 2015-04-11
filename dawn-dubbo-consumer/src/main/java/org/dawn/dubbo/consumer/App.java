package org.dawn.dubbo.consumer;

import org.dawn.dubbo.api.HelloService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * Hello world!
 *
 */
@Component
public class App {
	
	@Reference
	private HelloService helloService;

	public void sayHi() {
		helloService.sayHi();
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
