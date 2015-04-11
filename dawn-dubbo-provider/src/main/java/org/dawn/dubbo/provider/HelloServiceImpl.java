package org.dawn.dubbo.provider;

import org.dawn.dubbo.api.HelloService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component("helloService")
@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public void sayHi() {
		System.out.println("Hello world");
	}

	@Override
	public String sayHi(String name) {
		return  "Hello " + name;
	}

}
